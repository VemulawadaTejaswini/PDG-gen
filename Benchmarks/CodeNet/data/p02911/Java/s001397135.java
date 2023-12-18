
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long q = sc.nextInt();
		long[] point = new long[n];
		for(int i = 0; i < n; i++) {
			point[i] = 0;
		}
		for(int i = 0; i < q; i++) {
			int ac = sc.nextInt() - 1;
			point[ac]++;
		}
		for(int i = 0; i < n; i++) {
			if(k - (q - point[i]) > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
