import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();
		String[] D = new String[K];
		for (int i = 0; i < K; i++) {
			D[i] = Integer.toString(scan.nextInt());
		}

		while (true) {
			boolean foundFlag = false;
			String n = Integer.toString(N);
			for (String d : D) {
				if (n.contains(d)) {
					foundFlag = true;
					N++;
					break;
				}
			}
			if (!foundFlag) {
				break;
			}
		}
		System.out.println(N);
	}

}
