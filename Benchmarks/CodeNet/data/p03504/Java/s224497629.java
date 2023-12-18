import java.util.*;

// ABC 79-D
// https://beta.atcoder.jp/contests/abc079/tasks/abc079_d

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int C = in.nextInt();
		
		HashMap<Integer, ArrayList<Rokuga>> map = new HashMap<Integer, ArrayList<Rokuga>>();
		
		for (int i = 0; i < N; i++) {
			int startTime = in.nextInt() - 1;
			int endTime = in.nextInt();
			int channel = in.nextInt();
			
			ArrayList<Rokuga> a = new ArrayList<Rokuga>();
			if (map.containsKey(startTime)) {
				a = map.get(startTime);
			}
			
			boolean isSameIn = false;
			
			for (int j = 0; j < a.size(); j++) {
				Rokuga r = a.get(j);
				if (r.endTime == endTime && r.channel == channel) {
					isSameIn = true;
				}
			}
			
			if (!isSameIn) {
				a.add(new Rokuga(endTime, channel));
			}
			map.put(startTime, a);
		}
		
		HashMap<Integer, Integer> endTimes = new HashMap<Integer, Integer>(); // Stores endtime => number of rokuga ends in that end time
		int answer = 0;
		int temp = 0;
		
		for (int i = 0; i <= 100000; i++) {
			// Stop all rokuga that ends in this second
			if (endTimes.containsKey(i)) {
				temp -= endTimes.get(i);
				endTimes.remove(i);
			}
			
			if (map.containsKey(i)) {
				ArrayList<Rokuga> arrlist = map.get(i);
				for (int j = 0; j < arrlist.size(); j++) {
					int endTime = arrlist.get(j).endTime;
					if (endTimes.containsKey(endTime)) {
						endTimes.put(endTime, endTimes.get(endTime) + 1);
					} else {
						endTimes.put(endTime, 1);
					}
					temp++;
				}
			}
			answer = Math.max(answer, temp);
		}
		System.out.println(answer);
	}
}

class Rokuga {
	int endTime;
	int channel;
	
	public Rokuga(int endTime, int channel) {
		this.endTime = endTime;
		this.channel = channel;
	}
}