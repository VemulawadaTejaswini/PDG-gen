import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		scanner.close();
		int []n = {A, B, C};
		Arrays.sort(n);
		int ans = 0;
		int x = n[2] - n[1];
		int y = n[2] - n[0];
		if((x % 2 == 0 && y % 2 == 0) || (x % 2 == 1 && y % 2 == 1)) {
			ans = (x + y) / 2;
		}else {
			if(x == 1) {
				ans = 1 + y / 2 + 1;
			}else {
				ans = x / 2 + y / 2 + 2;
			}
		}
		System.out.println(ans);
	}
}