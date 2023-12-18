import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int numN = scan.nextInt();
		int numM = scan.nextInt();

		Integer[] cost = new Integer[numN];

		for (int i = 0;  i < numN; i++) {
			cost[i] = scan.nextInt();
		}

		for (int i = 0;  i < numM; i++) {
			Arrays.sort(cost, Collections.reverseOrder());
			cost[0] /= 2;
		}

		long sum = 0L;
		for (int i : cost) {
			sum += i;
		}

		System.out.println(sum);
	}
}