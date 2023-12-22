import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			long gcd = gcd(a,b);
			System.out.println(gcd + " " + (a*b/gcd));
		}
		
	}
	public static long gcd(long a,long b) {
		while(b!=0) {
			long r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
}