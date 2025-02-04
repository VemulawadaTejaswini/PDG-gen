import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long m = sc.nextLong();
		long n = sc.nextLong();
		
		System.out.printf(gcd(m, n)+" "+lcm(m, n));
	}
	
	public static long gcd(Long a, Long b){
		
		if(b == 0)	return a;
		else return gcd(b, a % b);
	}
	
	public static long lcm(long a, long b){
		return a * b / gcd(a, b);
	}
}