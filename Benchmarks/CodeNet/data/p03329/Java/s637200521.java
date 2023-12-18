import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ary6 = new int[]{46656, 7776, 1296, 216, 36, 6};
		int[] ary9 = new int[]{59049, 6561, 729, 81, 9, -1};
		int ctr = 0;
		int x = n;
		int less9 = 0;
		int less6 = 0;
		for ( int i = 0; i < 6; i++ ) {
			if ( x >= ary6[i] ) {
				less6 = i;
				break;
			}
		}
		for ( int i = 0; i < 6; i++ ) {
			if ( x >= ary9[i] ) {
				less9 = i;
				break;
			}
		}
		
		boolean greater6 = true;
		boolean greater9 = true;
		while (n > 9 && n > 6) {
			// greater6 = n >= less6 ;
			// greater9 = n >= less9;
			// System.out.println("g6: " + greater6 + " g9: " + greater9 );
			if ( greater6 == true && greater9 == true) {
				if ( ary6[less6] > ary9[less9] ) {
					n -= ary6[less6];
					ctr++;
				} else {
					n -= ary9[less9];
					ctr++;
				}
				greater6 = n >= ary6[less6];
				greater9 = n >= ary9[less9];
				// System.out.println(ary9[less9]);
				// System.out.println("g6: " + greater6 + " g9: " + greater9 );
				// System.out.println("n: " + n);
			} else if ( greater6 == true && greater9 == false ) {
				if ( less9 != 4 )
					less9++;
				if ( ary6[less6] > ary9[less9] ) {
					n -= ary6[less6];
					ctr++;
				} else {
					n -= ary9[less9];
					ctr++;
				}
				greater6 = n >= ary6[less6];
				greater9 = n >= ary9[less9];
				// System.out.println("g6: " + greater6 + " g9: " + greater9 );
				// System.out.println("n: " + n);
			} else if ( greater6 == false && greater9 == true ) {
				less6++;
				if ( ary6[less6] > ary9[less9] ) {
					n -= ary6[less6];
					ctr++;
				} else {
					n -= ary9[less9];
					ctr++;
				}
				greater6 = n >= ary6[less6];
				greater9 = n >= ary9[less9];
				// System.out.println("g6: " + greater6 + " g9: " + greater9 );
				// System.out.println("n: " + n);
			} else if ( greater6 == false && greater9 == false ) {
				less6++;
				if ( less9 != 4 ) {
					less9++;
				}
				if ( n >= ary9[less9] && n >= ary6[less6]) {
					if ( ary6[less6] > ary9[less9] ) {
					n -= ary6[less6];
					ctr++;
					} else {
						n -= ary9[less9];
						ctr++;
					}
				} else if ( n >= ary9[less9] && n < ary6[less6] ) {
					n -= ary9[less9];
					ctr++;
				} else {
					n -= ary6[less6];
					ctr++;
				}
				// System.out.println("n: " + n + "aaa");
				greater6 = n >= ary6[less6];
				greater9 = n >= ary9[less9];
				// System.out.println("6: " + ary6[less6] + " 9: " + ary9[less9] );
				// System.out.println("g6: " + greater6 + " g9: " + greater9 );
			}
		}
		
		System.out.println(ctr +n);
	}
}
