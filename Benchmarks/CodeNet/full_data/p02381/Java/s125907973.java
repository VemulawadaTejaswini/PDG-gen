import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();

			if(n == 0){
				break;
			}
			
			int[] arr = new int[n];
			long sum = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}

			double sigma = 0;
			for (int i = 0; i < n; i++) {
				sigma += (arr[i] - (sum / (double) (n))) * ((arr[i] - (sum / (double) (n))));
			}
			sigma /= (double) (n);

			System.out.printf("%.7f\n", Math.sqrt(sigma));
		}

	}
}