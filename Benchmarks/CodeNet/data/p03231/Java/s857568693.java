import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		sc.close();
		
		if(N < M) {
			int cap = N;
			N = M;
			M = cap;
			String cap2 = S;
			S = T;
			T = cap2;
		}
		
		if(S.equals(T)) {
			System.out.println(N);
		} else if(S.charAt(0) != T.charAt(0)){
			System.out.println("-1");
		} else if(N % M == 0){
			boolean flag = true;
			int n = N;
			int m = M;
			for(int i = 0;i < m;++i) {
				if(S.charAt(i*(n/m)) != T.charAt(i)) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(n);
			} else {
				System.out.println("-1");
			}
		} else {
			boolean flag = true;
			int gcd = 0;
			int n = N;
			int m = M;
			while(true) {
				if(n < m) {
					int cap = n;
					n = m;
					m = cap;
				}
				if(n == m) {
					gcd = n;
					break;
				}else if(n % m == 0){
					gcd = m;
					break;
				}else {
					n -= (n/m) * m;
				}
			}
			int ans = (N*M/gcd);
			for(int i = 0;i < ans;++i) {
				if((i/(ans/N))*(ans/N) == (i/(ans/M))*(ans/M)) {
					if(S.charAt((i/(ans/N))) != T.charAt((i/(ans/M)))) {
						flag = false;
						break;
					}
				}
			}
			if(flag) {
				System.out.println(ans);
			}else {
				System.out.println("-1");
			}
		}
	}
}
