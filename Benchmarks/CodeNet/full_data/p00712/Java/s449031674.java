import java.util.*;
public class Main {
	final double EPS = 1e-8;
	Scanner sc;
	int a,p,q;
	void run() {
		sc = new Scanner(System.in);
		while (true) {
			p = sc.nextInt();
			q = sc.nextInt();
			a = sc.nextInt();
			int n = sc.nextInt();
			if ( (p|q|a|n) == 0 ) break;
			
			System.out.println(solve(n,1,1,0));
		}	
	}

	int solve(int n, int d,int prod, int sum) {
		int cnt = 0;
		for (int i=d;prod*i<=a;i++) {
			int lhs = p*(prod*i);
			int rhs = sum*i + prod;
			if(lhs < rhs*q) continue;
			if(lhs == rhs*q) {cnt++;continue;}
			if(n==1) continue;
			cnt += solve(n-1,i,prod*i,rhs);
			
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}