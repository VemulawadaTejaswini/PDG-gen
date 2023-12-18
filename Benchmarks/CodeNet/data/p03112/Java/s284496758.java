import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int Q = sc.nextInt();
		long[] s = new long[A];
		long[] t = new long[B];
		long[] x = new long[Q];
		for (int i=0;i<A;i++) {
			s[i]=sc.nextLong();
		}
		for (int i=0;i<B;i++) {
			t[i]=sc.nextLong();
		}
		for (int i=0;i<Q;i++) {
			x[i]=sc.nextLong();
		}

		for (int i=0;i<Q;i++) {
			int near_s=near(x[i],s);
			int near_s_t=near(s[near_s],t);

			int near_t=near(x[i],t);
			int near_t_s=near(t[near_t],s);
			long min = Math.min(Math.abs(x[i]-s[near_s])+Math.abs(s[near_s]-t[near_s_t]),Math.abs(x[i]-t[near_t])+Math.abs(t[near_t]-s[near_t_s]));
			System.out.println(min);
		}
	}
	static int near(long x,long[] y) {
		int value=0;
		for (int j=0;j<y.length;j++) {
			if (Math.abs(y[j]-x)<Math.abs(y[value]-x)) {
				value=j;
			}
		}
		return value;
	}
}