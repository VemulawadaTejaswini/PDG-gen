import java.util.Scanner;

public class Main {
	static long a,b;
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		while(read()){
			System.out.println(gcd(a,b)+" "+lcm(a,b));
		}
	}

	private static boolean read() {
		if(!cin.hasNext())
        	return false;
        a = cin.nextLong();
        b = cin.nextLong();
		return true;
	}

	private static long gcd(long a, long b) {
		if(b == 0)
			return a;
		else
			return gcd(b,a%b);
	}

	private static long lcm(long a, long b) {
		return a*b/gcd(a,b);
	}
}