import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int gcd = getGCD(m, n);
		while(m <= 2000000000 && n <= 2000000000){
			System.out.println(getLCM(m, n, gcd));
			System.out.println(gcd);
			m = scanner.nextInt();
			n = scanner.nextInt();
		}
	}
	private static int getGCD(int m, int n) {
		return n == 0 ? m : getGCD(n, m % n);
	}

    private static int getLCM(int m, int n, int gcd) {
    	return m * n / gcd;
    }
}