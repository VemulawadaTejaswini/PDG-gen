import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long X = Long.parseLong(sc.next());
		System.out.println(patty(N, X));

		// if (0<=X && X<=1) {

		// } else if (1<=X && pow(2, N+1)-2<=X) {

		// } else if (X<=pow(2, N+1)-2 && pow(2, N+1)-1<=X) {

		// } else if (X<=pow(2, N+1)-1 && pow(2, N+2)-4<=X) {

		// } else if (X<=pow(2, N+2)-4 && pow(2, N+2)-3<=X) {

		// }
	}

	static long patty_sum(int N) {
		return pow(2, N+1)-1;
	}

	static long patty(int N, long X) {
		if (0<=X && X<=1) {
			// System.out.println("case 1");
			if (N==0) {
				return 1;
			} else {
				return 0;
			}
		} else if (1<=X && X<=pow(2, N+1)-2) {
			// System.out.println("case 2");
			return patty(N-1, X-1);
		} else if (pow(2, N+1)-2<=X && X<=pow(2, N+1)-1) {
			// System.out.println("case 3");
			return patty_sum(N-1)+1;
		} else if (pow(2, N+1)-1<=X && X<=pow(2, N+2)-4) {
			// System.out.println("case 4");
			return patty_sum(N-1)+1+patty(N-1, X-pow(2, N+1)+1);
		} else { // else if (pow(2, N+2)-4<=X && X<=pow(2, N+2)-3)
			// System.out.println("case 5");
			return patty_sum(N);
		}
	}
	// static long patty(int N, long X, long add) {
	// 	if (0<=X && X<=1) {
	// 		return add;
	// 	} else if (1<=X && pow(2, N+1)-2<=X) {
	// 		return patty(N-1, X-1, 0);
	// 	} else if (X<=pow(2, N+1)-2 && pow(2, N+1)-1<=X) {
	// 		return patty_sum(N-1)+1+add;
	// 	} else if (X<=pow(2, N+1)-1 && pow(2, N+2)-4<=X) {
	// 		return patty(N-1, X-pow(2, N+1)-1, patty_sum(N-1)+1);
	// 	} else { // else if (X<=pow(2, N+2)-4 && pow(2, N+2)-3<=X)
	// 		return patty_sum(N)+add;
	// 	}
	// }

	static long pow(long a,int n) {
	    long res=1;
	    while (n>0) {
	        if ((n-n/2*2)==1) {
	            res=res*a;
	        }
	        a=a*a;
	        n>>=1;
	    }
	    return res;
	}
}