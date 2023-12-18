import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			float n = sc.nextInt();
			float k = sc.nextInt();
			float result = 0;

			if (n < k) {
				for (int i = 1; i <= n; i++) {
					int j = 0;
					int a = i;
					while (a < k) {
						a *= 2;
						j++;
					}
					result += (1 / n) * (Math.pow(0.5,j));
				}
			} else {
				for (int i = 1; i <= n; i++) {
					int j = 0;
					int a = i;
					while (a < k) {
						a *= 2;
						j++;
					}
					result += (1 / n) * (Math.pow(0.5,j));
					if(a >= k) {
						break;
					}
				}
				result += (n-k)/n;
			}
			System.out.println(result);
		}
	}
}
