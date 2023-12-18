import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int x = sc1.nextInt();
		int[] a = new int[n];

		for ( int i = 0 ; i < n ; i++ ) {
			a[i] = sc1.nextInt();
		}

		Arrays.sort(a);

		int total = 0;
		int j = 0;

		while (true) {
			if ( j < a.length) {
				total += a[j];
				if ( total > x ) {
					break;
				}
				else if ( total == x ) {
					j++;
					break;
				}
				else {
					j++;
				}
			}
			else
				break;
		}

		if ( total < x) {
			j--;
		}

		System.out.println(j);

		sc1.close();

	}

}