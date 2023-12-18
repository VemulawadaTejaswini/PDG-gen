import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		sc.close();
		
		if(N % M == 0 || M % N == 0) {
			if(S.equals(T)) {
				System.out.println(N);
			}else {
				System.out.println("-1");
			}
		}else {
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
