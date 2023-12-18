import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = 0;
	
	void doIt() {
		long ans = 0;
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
			/*
			if(T1 * A1  < T1 * B1 && T1 * A1 + T2 * A2 - (T1 * B1 + T2 * B2) < 0) {
				long tmp = A1;
				A1 = A2;
				A2 = tmp;
				tmp = B2;
				B1 = B2;
				B2 = tmp;
			}
			long goal = Math.abs(T1 * A1 - T1 * B1);
			long diff = Math.abs(T1 * A1 + T2 * A2 - (T1 * B1 + T2 * B2));
			//System.out.println(goal);
			//System.out.println(diff);
			System.out.println(goal / diff * 2 + 1);
			*/
			long diff = T1 * A1 - T1 * B1;
			
			while(true) {
				long tmp = T2 * A2 + diff - T2 * B2;
				//System.out.println(tmp);
				if((diff <= 0) == (tmp <= 0)) {
					break;
				}
				diff = tmp;
				ans++;
				tmp = T1 * A1 + diff - T1 * B1;
				if(diff <= 0 == tmp <= 0) {
					break;
				}
				diff = tmp;
				ans++;
			}
			System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
