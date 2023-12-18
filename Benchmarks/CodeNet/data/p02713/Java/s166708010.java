import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int K = scan.nextInt();
		int ans = 0;

		for(int i = 1;i <= K;i++) {
			for(int j = 1;j <= K;j++) {
				for(int k = 1;k <= K;k++) {
					ans += gcd(i,gcd(j,k));
				}
			}
		}

		System.out.println(ans);

	}

	static int gcd(int a,int b) {
		int temp;
		while((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return b;
	}

}