public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a =scan.nextInt();
		int b =scan.nextInt();
		int gcd;
		if(a>b){
			gcd = gcd(a,b);
		}else{
			gcd = gcd(b, a);
		}
		int gld = a*b/gcd;
		System.out.println(gcd + " " + gld);
		scan.close();
	}

	private static int gcd(int m,int n){
		if(n==0){
			return m;
		}
		int o = n;
		n = m%n;
		m = o;
		if(m>n){
			return gcd(m,n);
		}else{
			return gcd(n,m);
		}
	}
}