import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int t=sc.nextInt();
		String a=sc.next();
		String b=sc.next();
		long ngs=lcm(a.length(),b.length());
		long yks=gcd((long)a.length(),(long)b.length());
		if(yks==1) {
			if(a.charAt(0)==b.charAt(0)) {
				System.out.println(lcm((long)a.length(),(long)b.length()));
			}
		}
		else {
			if(a.length()==b.length())
				if(a.equals(b)) {
					System.out.println(ngs);
				}
				else {
					System.out.println(-1);
				}
			else {
				for(int i=0; i<ngs/(Math.max(a.length(), b.length())); i++) {
					if(a.charAt((int) (ngs*i/b.length()))!=b.charAt((int) (ngs*i/a.length()))){
						System.out.println(-1);
						System.exit(0);
					}
				}
				System.out.println(ngs);
			}
		}
	}
	public static long lcm(long m, long n) {
		return m / gcd(m, n)*n;
	}
	public static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}
}