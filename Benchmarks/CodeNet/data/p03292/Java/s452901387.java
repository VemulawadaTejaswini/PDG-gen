import java.util.Arrays;
import java.util.Scanner;

/** かかった時間:10分 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		// ググった: Java sort https://www.sejuku.net/blog/14155
		Arrays.sort(a);
		int ans = a[2] - a[0];
		System.out.println(ans);
	}
}