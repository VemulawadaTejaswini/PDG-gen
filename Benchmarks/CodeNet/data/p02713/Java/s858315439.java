import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		try(Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
		}
		long sum = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				for(int k = 1; k <= n; k++) {
					sum += gcd(i, j, k);
				}
			}
		}
		System.out.println(sum);
	}


	private static int gcd(int a, int b, int c) {
		while(true) {
			int gcd = gcd(b, c);
			int tmp = a % gcd;
			if(tmp == 0) {
				return gcd;
			}
			
			a = b;
			b = c;
			c = tmp;
		}
	}
	private static int gcd(int a, int b) {
		int tmp;
        while ((tmp = a % b) != 0) {
            a = b;
            b = tmp;
        }
        return b;
	}
}
