import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] h = new int[n];
		int i;
		for(i = 0; i < n; i++) {
			h[i] = scan.nextInt();
		}
		for(i = n - 1; i >= 1; i--) {
			if(h[i] >= h[i - 1]) {

			}else if(h[i - 1] - h[i] == 1) {
				h[i - 1]--;
			}else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}