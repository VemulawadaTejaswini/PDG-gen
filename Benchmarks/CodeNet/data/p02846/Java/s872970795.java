import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = 0;

	void doIt() {
		long T1 = sc.nextLong();
		long T2 = sc.nextLong();
		long A1 = sc.nextLong();
		long A2 = sc.nextLong();
		long B1 = sc.nextLong();
		long B2 = sc.nextLong();
		if(T1 * A1 > T1 * B1 && T2 * A2 > T2 * B2) {
			System.out.println(0);
			return;
		}
		else if(T1 * A1 < T1 * B1 && T2 * A2 < T2 * B2) {
			System.out.println(0);
			return;	
		}
		else {
			if(T1 * A1 + T2 * A2 == T1 * B1 + T2 * B2) {
				System.out.println("infinity");
				return;
			}

			long goal = (T1 * A1 - T1 * B1);
			long diff = (T1 * A1 + T2 * A2 + T1 * B1 + T2 * B2);
			//System.out.println(goal);
			//System.out.println(diff);
			System.out.println((-goal + diff - 1) / diff) ;
		}
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
