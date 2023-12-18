import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] sunuke = new int[n];
		Arrays.fill(sunuke, 1);
		
		for (int i = 0; i < k; i++) {
			int d = sc.nextInt();
			for (int j = 0; j < d; j++) {
				int a = sc.nextInt();
				a--;
				sunuke[a] = 0;
			}
		}
		
		int ans = 0;
		for (int i : sunuke)
			ans += i;
		System.out.println(ans);
	}
}
