
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		
		int ans = 1;
		if (s == 1) {
			ans = 3;
		}
		
		if (s >= 2) {
			ans = (k + 1) + k + (k - 1);
		}
		
		System.out.println(ans);
	}
}