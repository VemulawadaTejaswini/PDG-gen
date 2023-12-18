import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String ans = solve();
		System.out.println(ans);
	}
	
	private static String solve() {
		Scanner sc = new Scanner(System.in);
		int nn = sc.nextInt();
		sc.close();
		
		for (int h = 1; h <= 3500; h++) {
			for (int n = h; n <= 3500; n++) {
				for (int w = n; w <= 3500; w++) {
					if (nn * (n * w + h * w + h * n) == 4 * h * n * w) {
						return (String.valueOf(h) + " " + String.valueOf(n) + " " + String.valueOf(w));
					}
				}
			}
		}
		return "";
	}
}