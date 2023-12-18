import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	public void solve() {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		sc.close();
		
		long gcdVal = gcd(a,b);
		System.out.println(a*b/gcdVal);
		
	}
	
	public long gcd(long a, long b) {
		
		long r = 1;
		while(r != 0) {
			if(a > b) {
				long tmp = a;
				a = b;
				b = tmp;
			}
			
			r = b % a;
			b = b/a;
		}
		
		return a;
	}
}
