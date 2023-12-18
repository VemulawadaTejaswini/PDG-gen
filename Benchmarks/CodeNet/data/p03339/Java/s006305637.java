import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		String s = sc.next();
		int ans = 300000, sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum = 0;
			for (int j = 0; j < n; j++) {
				if (j < i) {
					if (s.substring(j, j + 1).equals("W")) {
						sum++;
					}
				} else if (j > i) {
					if (s.substring(j, j + 1).equals("E")) {
						sum++;
					}
				}
			}
			if (sum < ans) {
				ans = sum;
			}
		}
		
		
		System.out.println(ans);

		sc.close();
	}
}
