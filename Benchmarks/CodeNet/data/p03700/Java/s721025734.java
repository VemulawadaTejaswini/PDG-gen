import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();
		long[] enemy = new long[n];

		for(int i = 0; i < n; i++) {
			enemy[i] = sc.nextInt();
		}

		Arrays.sort(enemy);

		long result = 0;
		int count = 1;

		while(enemy[n-count] - b * result > 0) {
			result += (enemy[n-count] - b * result) / a;
			if((enemy[n-count] - b * result) % a != 0) {
				result += 1;
			}
			count++;
			if(count >= n) {
				break;
			}
		}

		System.out.println(result);
	}

}
