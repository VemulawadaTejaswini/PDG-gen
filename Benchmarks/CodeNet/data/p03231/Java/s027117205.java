import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		sc.close();
		
		if(S.equals(T)) {
			System.out.println(N);
		} else if(S.charAt(0) != T.charAt(0)){
			System.out.println("-1");
		} else {
			boolean flag = true;
			int n = N;
			int m = M;
			String s = S;
			String t = T;
			if(n < m) {
				int cap = n;
				n = m;
				m = cap;
				s = T;
				t = S;
			}
			for(int i = 0;i < m;++i) {
				if(s.charAt(i*(n/m)) != t.charAt(i)) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(n);
			} else {
				int gcd = 0;
				n = N;
				m = M;
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
				flag = true;
				int ans = (N*M/gcd);
				for(int i = 0;i < ans;++i) {
					if((i/N)*(ans/N) == (i/M)*(ans/M)) {
						if(S.charAt((i/N)*(ans/N)) != T.charAt((i/M)*(ans/M))) {
							System.out.println(S.charAt((i/N)*(ans/N)) + ":" + T.charAt((i/M)*(ans/M)));
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
}
