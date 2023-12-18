import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inN = stdin.nextInt();
		int inK = stdin.nextInt();

		int count = 0;
		for (int b = 1; b <= inN; b++) {
			int div = inN / b;
			int mod = inN % b;
			count += div * Math.max(0, (b - inK)) + Math.max(0, (mod - inK + 1));
		}

		if (inK == 0) {
			count -= inN;
		}

		System.out.println(count);
	}

}
