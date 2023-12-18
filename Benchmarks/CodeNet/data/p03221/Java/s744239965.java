import java.util.*;

public class Main {
	int N, M;
	List<Integer> P;
	List<Long> Y;

	Map<Integer, Queue<Long>> maps = new TreeMap<>();
	List<String> results;

	public Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		P = new ArrayList<>(M);
		Y = new ArrayList<>(M);
		for (int i = 0; i < M; ++i) {
			P.add(in.nextInt());
			Y.add(in.nextLong());
		}
		in.close();
		results = new ArrayList<>(M);
	}

	private void calc() {
		for (int i = 0; i < M; ++i) {
			int p = P.get(i);
			long y = Y.get(i);
			if (!maps.containsKey(p)) {
				maps.put(p, new PriorityQueue<Long>());
			}
			maps.get(p).offer(y);
		}

		for (Integer p : maps.keySet()) {
			int index = 1;
			Queue<Long> cities = maps.get(p);
			String pStr = p2Str(p);
			while (!cities.isEmpty()) {
				long city = cities.poll();
				String no = pStr + p2Str(index);
				results.add(no);
				++index;
			}
		}
	}

	private String p2Str(int p) {
		return String.format("%06d", p);
	}

	private void show() {
		for (int i = 0; i < results.size(); ++i) {
			System.out.println(results.get(i));
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		Collections.sort(ins.results);
		ins.show();
	}

}