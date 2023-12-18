
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		
		int max = Math.max(h, w);
		int ans = 0;
		
		for (int i = 1;; i++) {
			if (max * i >= n) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}