import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static long[] cnt = null;
	static HashMap<Integer, ArrayList<Integer>> map = null;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();

		// 各ノードの直属の子（自分を含む）を記録したい
		map = new HashMap<>();
		for ( int i = 1; i <= n; i++ ) {
			ArrayList<Integer> set = new ArrayList<Integer>();
			set.add(i);
			map.put(i, set);
		}
		for ( int i = 1; i < n; i++ ) {
			int a = in.nextInt();
			int b = in.nextInt();

			ArrayList<Integer> temp = map.get(a);
			temp.add(b);
			map.put(a, temp);
		}
		// System.out.println(map);

		cnt = new long[n + 1];
		for ( int i = 1; i <= q; i++ ) {
			int p = in.nextInt();
			int x = in.nextInt();
			calc(map.get(p), p, x);
		}

		for ( int i = 1; i <= n; i++ ) {
			System.out.print(cnt[i] + " ");
		}
		in.close();
	}
	
	private static void calc(ArrayList<Integer> list, int p, int x) {
		// System.out.println("p is " + p + " x is" + x);
		if(list.size() == 1) {
			cnt[list.get(0)] += x;
			return;
		}
		for ( Integer c :list) {
			if( p == c)cnt[c] += x;
			if( p != c)	calc(map.get(c), c, x);
		}		
	}
}
