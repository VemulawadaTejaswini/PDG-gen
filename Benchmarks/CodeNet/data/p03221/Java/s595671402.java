import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Pair implements Comparable<Pair>{
		int p;
		int y;
		Pair(int x, int y){
			this.p=x;
			this.y=y;
		}
		@Override
		public int compareTo(Pair arg0) {
			return Integer.compare(this.y, arg0.y);
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Pair> py = new ArrayList<>();
		ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			l.add(new ArrayList<Integer>());
		}
		for(int i=0; i<m; i++) {
			int p = sc.nextInt();
			int y = sc.nextInt();
			py.add(new Pair(p, y));
			l.get(p).add(y);
		}
		for(int i=0; i<n; i++) {
			Collections.sort(l.get(i));
		}
		for(int i=0; i<m; i++) {
			Pair pair = py.get(i);
			ArrayList<Integer> list = l.get(pair.p);
			int index = Collections.binarySearch(list, pair.y);
			index++;
			System.out.printf("%06d%06d\n", pair.p, index);
		}
		sc.close();
	}
}
