import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int x = in.nextInt();

		int ans = 0;
		int sum = 0;
		int[] l = new int[n];
		for ( int i = 0; i < n; i++ ) {
			l[i] = in.nextInt();
		}

		for ( int i = 0; i < l.length; i++ ) {
			sum += l[i];

			if ( sum == x ) {
				ans = i + 2;
				break;
			} else if ( sum > x ) {
				ans = i + 1;
				break;
			}
		}

		System.out.println(ans);
		in.close();
	}
}
