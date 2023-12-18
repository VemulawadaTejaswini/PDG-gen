import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String s = scanner.next();
		String t = scanner.next();

		int gcd = gcd(n, m);
		int lcm = (int)((long)n*m/gcd);

		for(int kn=0; kn<n; kn++){
			if(kn%(n/gcd)==0){
				if (s.charAt(kn)!=t.charAt((int)((long)m*kn/n))) {
					System.out.println(-1);
					System.exit(0);
				}
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