import java.util.Scanner;

public class Main {
	static long[] a;
	static long[] p;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long X = Long.parseLong(sc.next());

		a = new long [N+1];
		p = new long [N+1];

		a[0] = 1;
		p[0] = 1;

		for(int i=1;i<N;i++) {
			a[i] = a[i-1]*2+3;
			p[i] = p[i-1]*2+1;
		}

		System.out.println(f(N,X));


	}

	static long f(int N, long X) {
		if(N==0) {
			if(X <= 0) {return 0;
			}else { return 1;}
		}else {
			if(X <= 1) {return 0;
			}else if(1 < X && X < 2 + a[N-1]) {return f(N-1, X-1);
			}else if(X == 2 + a[N-1]) { return p[N-1] + 1;
			}else if(2+a[N-1] < X && X < 2*a[N-1]+3) {return p[N-1]+1+f(N-1, X-a[N-1]-2);
			}else {return 2*p[N-1]+1;
			}

		}
	}

}