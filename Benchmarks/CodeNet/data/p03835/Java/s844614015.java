
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
			ans = (s + 2) * (s + 1) / 2;
		}
		
		System.out.println(ans);
	}
}