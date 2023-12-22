import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		long k = stdIn.nextLong();

		Transporter transporter = new Transporter();
		IntStream.rangeClosed(1, n).forEach(i -> transporter.add(i, stdIn.nextInt()));

		System.out.println(transporter.simulate(k));

		stdIn.close();
	}
}

class Transporter {
	private Map<Integer, Integer> map = new HashMap<>();

	public int simulate(long k) {
		List<Integer> periods = period();

		//周期
		int lastNo = periods.get(periods.size()-1);
		int lastIndex = periods.size() -1;
		int firstIndex = getFirstIndex(periods, lastNo);
		int periodNo = lastIndex - firstIndex;

		int distFromPeriod = firstIndex;

		if(k <= distFromPeriod) {
			return move(1, (int)k);
		}

		return move(lastNo, (k-distFromPeriod) % periodNo);

	}

	public int getFirstIndex(List<Integer> periods, int no) {
		int index = 0;

		for (Integer p : periods) {
			if(p == no) {
				return index;
			}
			index++;
		}
		return -1;

	}

	public int move(int init, long n) {
		for (long i = 0; i < n; i++) {
			init = get(init);
		}

		return init;
	}

	public void add(int start, int end) {
		map.put(start, end);
	}

	public int get(int no) {
		return map.get(no);
	}

	public List<Integer> period() {
		List<Integer> trajectory = new ArrayList<>();

		int current = 1;
		trajectory.add(current);

		while (true) {
			current = get(current);

			final int checkNum = current;

			trajectory.add(current);

			if (trajectory.stream().filter(t -> t == checkNum).count() == 2) {
				return trajectory;
			}
		}
	}
}