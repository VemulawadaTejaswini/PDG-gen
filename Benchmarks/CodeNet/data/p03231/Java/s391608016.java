import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String s = scanner.next();
		String t = scanner.next();

		int gcd = gcd(n, m);
		long lcm = n/gcd*m;

		for(int kn=0; kn<n; kn+=n/gcd){
			int km = (int)((long)m*kn/n);
			if (s.charAt(kn)!=t.charAt(km)) {
				System.out.println(-1);
				System.exit(0);
			}
		}
		System.out.println(lcm);


	}

	static int gcd(int a, int b){
		if (a<b){	//a>=bほしょー
			int c = a;	a = b;	b = c;
		}
		while(a%b!=0) {
			int c = a%b;	a=b;	b=c;
		}
		return b;
	}

}