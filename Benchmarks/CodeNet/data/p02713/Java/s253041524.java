import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int k = scan.nextInt();
		int sum = 0;

		for(int a = 1;a <= k;a++) {
			for(int b = 1;b <= k;b++) {
				for(int c = 1;c <= k;c++) {
					sum += gcd(gcd(c , b) , a);
				}
			}
		}

		System.out.println(sum);
	}

	public static int gcd(int a , int b) {
		if(b == 0) {
			return a;
		}

		return gcd(b , a % b);
	}
}
