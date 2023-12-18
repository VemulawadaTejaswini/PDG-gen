import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int k = sc.nextInt();

		if ( k <= 12 ) {
			System.out.println(k);
			System.exit(0);
		}

		LinkedList<Long> ll = new LinkedList<Long>();
		for ( int i=1; i<=9; i++ ) {
			ll.add((long)i);
		}
		int ix = 0;

		while ( ll.size() < k ) {
			long li = ll.get(ix);
			long last = li%10l;
			long add0 = li*10l + last;
			if ( last!=0 ) {
				ll.addLast(add0-1l);
			}

			ll.addLast(add0);

			if ( last!=9 ) {
				ll.addLast(add0+1l);
			}

			ix++;
		}

		System.out.println(ll.get(k-1));
	}
}
