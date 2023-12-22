import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int Q = stdIn.nextInt();
		int[] c = new int[N];
		for(int i = 0; i < N; i++) {
			c[i] = stdIn.nextInt();
		}
		Arrays.sort(c);
		
		for(int i = 0; i < Q; i++) {
			int q = stdIn.nextInt();
			int max = q-1;
			IN:for(int j = 1; j <= max; j++) {
				for(int k = 1; j*k <= 300000; k++) {
					if(Arrays.binarySearch(c, (q*k)-j) >= 0) {
						System.out.println(q-j);
						break IN;
					}
				}
				System.out.println(0);
			}
		}

		

	}
}