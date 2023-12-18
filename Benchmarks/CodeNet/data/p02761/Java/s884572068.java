import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m =scan.nextInt();

		int num[] = new int[n];
		 Arrays.fill(num, -1);
		 boolean r = true;

		for(int i = 0 ; i < m ; i++) {
			int s = scan.nextInt();
			int c = scan.nextInt();
			if(num[s-1] == -1 || num[s-1] == c) {
				num[s-1] = c;
			}else {
				r = false;
			}
		}

		if(r) {
			if(num[0] == 0) {
				System.out.println(-1);
			}else {
				System.out.print( num[0] == -1 ? 1 : num[0] );
				for(int i = 1 ; i < n ; i++) {
					if(num[i] == -1) {
						num[i] = 0;
					}
					System.out.print(num[i]);
				}
				System.out.println();
			}
		}else {
			System.out.println(-1);
		}

	}
}
