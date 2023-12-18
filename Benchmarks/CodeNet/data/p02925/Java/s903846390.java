import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		LinkedList<Integer>[] a = new LinkedList[n + 1];
		for ( int r = 1; r <= n; r++ ) {
			a[r] = new LinkedList<Integer>();
			for ( int c = 0; c < n - 1; c++ ) {
				a[r].add(in.nextInt());
			}
		}

//		for ( LinkedList<Integer> list : a ) {
//			System.out.println(list);
//		}

		int days = 0;
		boolean stalemate;
		do {
			stalemate = true; // 手詰まり
			days++;
			// p:player
			for ( int p = 1; p <= n; p++ ) {
				try {
					Integer temp1 = (Integer) a[p].getFirst();
					Integer temp2 = (Integer) a[temp1].getFirst();
					
					if ( p == temp2 ) {
						// System.out.println("p r is" + p + "_" + temp1 + " done");
						a[p].removeFirst();
						a[temp1].removeFirst();
						stalemate = false;
					}

				} catch (Exception e) {
					continue;
				}
				
			}
		} while ( !stalemate );
		
		for ( int i = 1; i <= n; i++ ) {
			if ( a[i].size() != 0 ) {
				System.out.println("-1");
				in.close();
				return;
			}
		}
		System.out.println(days);
		in.close();
	}
}
