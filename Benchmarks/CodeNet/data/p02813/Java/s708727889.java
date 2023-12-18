import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = (int)1e6 + 1;

	void doIt() {
		int N = sc.nextInt();
		int P[] = new int[N];
		int Q[] = new int[N];
		for(int i = 0; i < N; i++)
			P[i] = sc.nextInt();
		for(int i = 0; i < N; i++)
			Q[i] = sc.nextInt();
		
		int numP = 1;
		for(int i = 0; i < N; i++) {
			int dig = P[i];
			int cnt = 0;
			for(int j = 0; j < i; j++) {
				if(dig > P[j]) {
					cnt++;
				}
			}
			numP += (dig - cnt - 1) * f(N - i - 1);
			//System.out.println((dig - 1) + " * " + (N - i - 1) + "! ");

		}
		int numQ = 1;
		for(int i = 0; i < N; i++) {
			int dig = Q[i];
			int cnt = 0;
			for(int j = 0; j < i; j++) {
				if(dig > Q[j]) {
					cnt++;
				}
			}
			numQ += (dig - cnt - 1) * f(N - i - 1);
			//System.out.println(numQ);
			//System.out.println((dig - 1) + " * " + (N - i - 1) + "! ");
		}
		//System.out.println(numP + " " + numQ);
		System.out.println(Math.abs(numP - numQ));
	}
	
	int f(int n) {
		if(n <= 0) return 0;
		int ans = 1;
		for(int i = 1; i <= n; i++) {
			ans *= i;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
