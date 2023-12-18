import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int x = in.nextInt();

		int sum = 0;
		int[] l = new int[n];
		for ( int i = 0; i < n; i++ ) {
			l[i] = in.nextInt();
		}

		int cnt = 1;
		for ( int i = 0; i < n; i++ ) {
			
			sum += l[i];

			if ( sum > x ) {
				break;
			}
			
			cnt++;
		}

		System.out.println(cnt);
		in.close();
	}
}
