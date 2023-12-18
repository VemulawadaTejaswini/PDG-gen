import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int s = scan.nextInt();
		int c = 0;
		for (int i = 0; i <= k; i++) {
			for (int j = 0; j <= k; j++) {
				for (int l = 0; l<= k; l++) {
					if (i+j+l == s) {
						c++;
					}
				}
			}
		}
		System.out.println(c);
	}
}
