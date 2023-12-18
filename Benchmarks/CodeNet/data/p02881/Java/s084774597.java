import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		
		if(ifPrime(n)) {
			System.out.println((long)(n-1));
			return;
		}
		
		for(int i = (int) Math.sqrt(n); i>0;i++) {
			if(n%i==0) {
				System.out.println(n/i + i - 2);
				break;
			}
		}
	}
	
	public static boolean ifPrime(double d) {
		// prime -> true
		if(d%2==0)return false;
		for(double i=0;i<Math.sqrt(d);i+=2) {
			if(d%i==0)return false;
		}
		return true;
	}

}
