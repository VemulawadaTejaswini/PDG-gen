import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().doIt();
	}
	void doIt() {
		abc113c();
	}
	void abc113c() {
		HashMap<Integer, ArrayList<Record>> data = new HashMap<Integer, ArrayList<Record>>();
		int N = sc.nextInt(), M = sc.nextInt();
		String [] ans = new String[M];
		for(int i = 0; i < M; i++) {
			int p = sc.nextInt(), y = sc.nextInt();
			if(! data.containsKey(p)) {
				data.put(p,  new ArrayList<Record>());
			}
			data.get(p).add(new Record(y, i));
		}
		for(Integer key: data.keySet() ) {
			ArrayList<Record> ar = data.get(key);
			Collections.sort(ar);
			int nth = 0;
			for(Record r: ar) {
				ans[r.id] = String.format("%06d%06d", key, ++nth);
			}
		}
		for(int i = 0; i < M; i++) {
			System.out.println(ans[i]);
		}
	}
	class Record implements Comparable<Record> {
		Record(int y, int id) {
			this.year = y;
			this.id = id;
		}
		int year, id;
		public int compareTo(Record o) {
			if (year != o.year) {
				return year - o.year;
			} else {
				return id - o.id;
			}
		}
	}
}
