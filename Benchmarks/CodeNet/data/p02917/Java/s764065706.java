import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値(N)
		int numN = scan.nextInt();

		//入力値(N)
		long[] listA = new long[numN];
		long[] listB = new long[numN-1];

		for (int i = 0; i < numN-1; i++) {
			listB[i] = scan.nextLong();
		}

		listA[0] = listB[0];
		listA[numN-1] = listB[numN-2];

		for (int i = 1; i < numN-1; i++) {
			listA[i] = Math.min(listB[i-1],listB[i]);
		}

		long sum = 0L;
		for (int i = 0; i < numN; i++) {
			sum += listA[i];
		}

		System.out.println(sum);
	}
}