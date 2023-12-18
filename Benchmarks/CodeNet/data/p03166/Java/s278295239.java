import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static ArrayList<Integer>[] chld;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();

		chld = new ArrayList[n + 1];
		for ( int i = 0; i <= n; i++ ) {
			chld[i] = new ArrayList<Integer>();
		}

		HashSet<Integer> from = new HashSet<Integer>();
		HashSet<Integer> to = new HashSet<Integer>();

		for ( int i = 0; i < m; i++ ) {
			int x = in.nextInt(), y = in.nextInt();
			chld[x].add(y);

			from.add(x);
			to.add(y);
		}

		// 出発点候補
		from.removeAll(to);

//		for ( ArrayList<Integer> list : chld ) {
//			System.out.println(list);
//		}

		//				for ( Integer i : from ) {
		//					System.out.print(i);
		//				}

		int lenmax = 0;
		for ( Integer i : from ) {
			lenmax = Math.max(lenmax, search(i, 0) );
		}
		System.out.println(lenmax);
		in.close();

	}

	private static int search(Integer prnt, int prntlen) {
//		System.out.println("prnt:" + prnt + "len:" + prntlen);

		int nowlen = prntlen + 1;
		if ( chld[prnt].size() == 0 ) {
//			System.out.println();
			return prntlen;
		}
		for ( Integer i : chld[prnt] ) {
			prntlen = Math.max(prntlen, search(i, nowlen));
		}
		return prntlen;
	}
}