import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int[] a = new int[n];
		long total = 0;

		for ( int i = 0 ; i < n ; i++) {
			a[i] = sc1.nextInt();
			total += a[i];
		}

		Arrays.sort(a);

		System.out.println(a[0] + " " + a[n-1] + " " + total);

		sc1.close();

	}

}
