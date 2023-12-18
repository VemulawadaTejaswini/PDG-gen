import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int numN = scan.nextInt();
		int numM = scan.nextInt();

		PriorityQueue<Integer> numA = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0;  i < numN; i++) {
			numA.add(scan.nextInt());
		}

		for (int i = 0;  i < numM; i++) {
			numA.add(numA.poll() / 2);
		}

		long sum = 0L;
		for (int i : numA) {
			sum += i;
		}

		System.out.println(sum);
	}
}