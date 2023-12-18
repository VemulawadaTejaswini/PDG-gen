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
		int N = sc.nextInt(), M = sc.nextInt();
		Record [] data = new Record[M+1];
		String [] ans = new String[M];
		data[0] = new Record(-1, -1, -1);
		for(int i = 0; i < M; i++) {
			int p = sc.nextInt(), y = sc.nextInt();
			data[i+1] = new Record(p, y, i);
		}
		Arrays.sort(data);
		int nth = 1;
		for(int i = 1; i <= M; i++) {
			if(data[i-1].preference != data[i].preference) {
				nth = 1;
			} else nth++;
			ans[data[i].id] = String.format("%06d%06d", data[i].preference, nth);
		}
		for(int i = 0; i < M; i++) {
			System.out.println(ans[i]);
		}
	}
	class Record implements Comparable<Record> {
		Record(int p, int y, int id) {
			this.preference = p;
			this.year = y;
			this.id = id;
		}
		int preference, year, id;
		public int compareTo(Record o) {
			if(preference != o.preference) {
				return preference - o.preference;
			} else if (year != o.year) {
				return year - o.year;
			} else {
				return id - o.id;
			}
		}
	}
}
