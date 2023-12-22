import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner(System.in);
		PrintWriter pwriter = new PrintWriter(System.out);

		while (true) {
			int n = scan.nextInt(); // stairs
			int m = scan.nextInt(); // elevators
			if (n == 0 && m == 0)
				break;
			int d = scan.nextInt(); // distance between stairs

			DataCenter dc = new DataCenter(n, m, d, debug);
			for (int i = 0; i < n; i++)
				dc.setDevice(i, scan.nextInt());
			for (int i = 0; i < m; i++)
				dc.setElevator(i, scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
			dc.setFire(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());

			dc.operate();
			pwriter.print(dc.getDevice());
			pwriter.print(" ");
			pwriter.print(dc.getTime());
		}

		pwriter.flush();

		scan.close();
		System.exit(0);
	}
}

class DataCenter {
	boolean debug;
	int distance;
	int distination;
	double current;
	int resqueDevice;

	// floor
	int[] floorDevice;
	boolean[] floorBurn;

	int[] capacity;
	int[] speed;
	int[] waitTime;
	int[] remain;
	double[] launchTime;
	double[] height;
	boolean[] isReturning;

	class Event {
		double time;
		char type;
		int elevator;
		int floor;

		public Event(double time, char type, int elevator, int floor) {
			this.time = time;
			this.type = type;
			this.elevator = elevator;
			this.floor = floor;
		}
	}

	PriorityQueue<Event> pQueue = new PriorityQueue<Event>(1, new EventComp());

	class EventComp implements Comparator<Event> {

		@Override
		public int compare(Event o1, Event o2) {
			if (o1.time > o2.time)
				return 1;
			else if (o1.time == o2.time)
				return 0;
			else
				return -1;
		}

	}

	public DataCenter(int n, int m, int d, boolean debug) {
		this.debug = debug;

		floorDevice = new int[n];
		floorBurn = new boolean[n];

		capacity = new int[m];
		remain = new int[m];
		speed = new int[m];
		waitTime = new int[m];
		height = new double[m];
		isReturning = new boolean[m];
		launchTime = new double[m];

		distance = d;
		distination = Integer.MAX_VALUE;
	}

	public int getDevice() {
		return resqueDevice;
	}

	public double getTime() {
		return current;
	}

	public void operate() {
		current = 0;
		operateElevator();

		while (!pQueue.isEmpty()) {
			Event e = pQueue.poll();
			if (debug) {
				System.out
						.println("time=" + e.time + "\ttype=" + e.type + "\telv=" + e.elevator + "\tfloor=" + e.floor);
			}
			current = e.time;
			if (e.type == 'F') {
				// floor was burned out, reset all elevators
				floorBurn[e.floor] = true;
				operateElevator();

			} else {
				// judge the each elevator
				int i = e.elevator;

				if (isReturning[i]) { // if elevator is moving to grand floor
					if (!isZero(height[i] - speed[i] * (current - launchTime[i])))
						continue; // skip if not reached
					if (debug)
						System.out.println("- back to grand floor, device=" + (capacity[i] - remain[i]));
					// if reached to grand floor, set elevator status to free
					// after drop the device
					resqueDevice += (capacity[i] - remain[i]);
					remain[i] = capacity[i];
					height[i] = 0;
					isReturning[i] = false;
					launchTime[i] = current + waitTime[i];
					if (isFinish())
						return;
					// set estimation time to arrive the target floor again
					pQueue.add(new Event(launchTime[i] + distination * distance / speed[i], 'E', i, -1));

				} else { // elevator is moving to target floor
					if (!isZero(Math.abs(height[i] - distination * distance) - speed[i] * (current - launchTime[i])))
						continue; // skip if not reached

					// load device into elevator
					height[i] = distination * distance;
					launchTime[i] = current + waitTime[i];
					int d = Math.min(floorDevice[distination], remain[i]);
					if (debug)
						System.out.println("- arrived to " + distination + " device=" + d);
					floorDevice[distination] -= d;
					remain[i] -= d;

					// launch new floor after wait time, or return to grand
					// floor
					if (remain[i] == 0) {
						isReturning[i] = true;
						pQueue.add(new Event(launchTime[i] + height[i] / speed[i], 'E', i, -1));
					}
					
					// if all device on this floor is loaded, reset all elevator
					if (floorDevice[distination] == 0)
						operateElevator();
				}
			}
		}
	}

	private void operateElevator() {
		int newDist = getTargetFloor();
		if (newDist == distination)
			return; // nothing to do, if floor status is not changed

		for (int i = 0; i < capacity.length; i++) {
			// process all elevator except returning to grand floor
			if (isReturning[i])
				continue;

			// update current height and launch time
			if (current > launchTime[i]) {
				double h = (current - launchTime[i]) * speed[i];
				if (height[i] > distination * distance)
					height[i] -= h;
				else
					height[i] += h;
				launchTime[i] = current;
			}

			if (newDist == -1) {
				// return to grand floor if no more device
				isReturning[i] = true;
				pQueue.add(new Event(launchTime[i] + height[i] / speed[i], 'E', i, -1));
			} else // set estimation time to go to new floor
				pQueue.add(new Event(launchTime[i] + Math.abs(newDist * distance - height[i]) / speed[i], 'E', i, -1));

		}
		distination = newDist;
	}

	public void setFire(int k, int tx, int ty, int tz) {
		pQueue.add(new Event(tx, 'F', -1, k - 1)); // set burn out time
		double time = tx;
		for (int i = k; i < floorBurn.length; i++) { // upper
			time += ty;
			pQueue.add(new Event(time, 'F', -1, i));
		}
		time = tx;
		for (int i = k - 2; i >= 0; i--) { // down
			time += tz;
			pQueue.add(new Event(time, 'F', -1, i));
		}
	}

	private int getTargetFloor() {
		for (int i = floorBurn.length - 1; i >= 0; i--)
			if (!floorBurn[i] && floorDevice[i] > 0)
				return i;
		return -1;
	}

	private boolean isFinish() {
		if (getTargetFloor() != -1)
			return false;
		for (int i = 0; i < capacity.length; i++)
			if (!isZero(height[i]) || isReturning[i])
				return false;
		return true;
	}

	private boolean isZero(double x) {
		if (Math.abs(x) <= 0.00001)
			return true;
		else
			return false;
	}

	public void setElevator(int i, int c, int v, int ts, int x) {
		capacity[i] = c;
		remain[i] = c;
		speed[i] = v;
		waitTime[i] = ts;
		height[i] = (x - 1) * distance;
		isReturning[i] = false;
	}

	public void setDevice(int i, int n) {
		floorDevice[i] = n;
	}
}

class UserScanner {
	private InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public UserScanner(InputStream inStream) {
		in = inStream;
	}

	private void read() {
		ptr = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(9);
		}
	}

	private byte getByte() {
		if (ptr >= buflen)
			read();
		if (buflen < 0 || isCtlSpace(buffer[ptr])) {
			return -1;
		} else
			return buffer[ptr++];
	}

	private void skipCtlSpace() {
		for (; ptr < buflen; ptr++)
			if (!isCtlSpace(buffer[ptr]))
				return;
		read();
		skipCtlSpace();
	}

	private boolean isCtlSpace(byte b) {
		if (b <= ' ' || b > '~')
			return true;
		else
			return false;
	}

	public void close() {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(9);
		}
	}

	public String next() {
		skipCtlSpace();
		StringBuilder sb = new StringBuilder();
		byte b;
		while ((b = getByte()) != -1) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		skipCtlSpace();
		int n = 0;
		boolean minus = false;
		byte b;
		while ((b = getByte()) != -1) {
			if (b == '-')
				minus = true;
			else {
				n *= 10;
				n += (b - '0');
			}
		}
		if (minus)
			return n * -1;
		else
			return n;
	}
}