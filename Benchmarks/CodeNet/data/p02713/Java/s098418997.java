import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int result = 0;
		for (int a = 1; a <= K; a++) {
			for (int b = 1; b <= K; b++) {
				for (int c = 1; c <= K; c++) {
					result += gcd(gcd(a, b), c);
				}
			}
		}
		System.out.println(result);
	}

	public static int gcd(int a, int b){
		return b > 0 ? gcd(b,a%b) : a;
		}

}
