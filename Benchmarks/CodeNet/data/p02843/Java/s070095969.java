import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		int ans = 0;

		int t = x / 100;
		t++;

		out: for(int i = 0; i < t; i++) {
			for(int j = 0; j < t - i; j++) {
				for(int k = 0; k < t - i -  j; k++) {
					for(int l = 0; l < t - i - j - k; l++) {
						for(int m = 0; m < t - i - j - k - l; m++) {
							for(int n = 0; n < t - i - j - k - l - m; n++) {
								int a = 100 * i + 101 * j + 102 * k + 103 * l + 104 * m + 105 * n;
								if( a == x) {
									ans = 1;
									break out;
								}
							}
						}
					}
				}
			}
		}

		System.out.println(ans);

	}

}
