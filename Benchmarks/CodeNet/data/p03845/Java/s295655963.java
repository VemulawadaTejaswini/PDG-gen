
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] time = new int[n];
		for (int i = 0; i < time.length; i++) {
			time[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[][] drink = new int[m][2];
		for (int i = 0; i < drink.length; i++) {
			drink[i][0] = sc.nextInt();
			drink[i][1] = sc.nextInt();
		}
		
		for (int i = 0; i < drink.length; i++) {
			int ans = 0;
			for (int j = 0; j < time.length; j++) {
				if (j == drink[i][0] - 1) {
					ans += drink[i][1];
					continue;
				}
				ans += time[j];
			}
			System.out.println(ans);
		}
		
	}
}