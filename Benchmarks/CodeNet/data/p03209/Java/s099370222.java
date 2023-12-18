import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long X = Long.parseLong(sc.next());
		System.out.println(patty(N, X));
	}

	static long patty_sum(int N) {
		return pow(2, N+1)-1;
	}

	static long patty(int N, long X) {
		if (0<=X && X<=1) {
			if (N==0) {
				return 1;
			} else {
				return 0;
			}
		} else if (1<=X && X<=pow(2, N+1)-2) {
			return patty(N-1, X-1);
		} else if (pow(2, N+1)-2<=X && X<=pow(2, N+1)-1) {
			return patty_sum(N-1)+1;
		} else if (pow(2, N+1)-1<=X && X<=pow(2, N+2)-4) {
			return patty_sum(N-1)+1+patty(N-1, X-pow(2, N+1)+1);
		} else {
			return patty_sum(N);
		}
	}

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