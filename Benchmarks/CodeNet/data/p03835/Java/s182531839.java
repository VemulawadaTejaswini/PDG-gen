
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		int cnt = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i <= k; i++) {
			a = i;
			for (int j = 0; j <= k; j++) {
				if (i + j > k) {
					break;
				}
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
