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
		} else if(N % M == 0 || M % N == 0) {
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
				}
			}
			if(flag) {
				System.out.println(n);
			}else {
				System.out.println("-1");
			}
			
		} else {
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
			System.out.println((N*M/gcd));
		}
	}
}
