import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		long sum = sc.nextLong();
		boolean can = true;
		for (int i = 1; i < a; i++) {
			long m = sc.nextLong();
			sum *= m;
			if (1000000000000000000l < sum) can = false;
		}

		if (can || 1000000000000000000l >= sum) {
			System.out.println(sum);
		} else {
			System.out.println(-1);
		}

		sc.close();
	}

}
