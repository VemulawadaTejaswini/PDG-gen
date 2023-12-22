import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int[] rsum = new int[c];
		int allsum = 0;
		for (int i = 0; i < r + 1; i++) {
			int csum = 0;
			for (int j = 0; j < c + 1; j++) {
				if (i == r && j == c) {
					System.out.println(allsum);
				} else if (j == c) {
					allsum += csum;
					System.out.println(csum);
				} else if (i == r) {
					System.out.print(rsum[j] + " ");
				} else {
					int val = scan.nextInt();
					System.out.print(val + " ");
					csum += val;
					rsum[j] += val;
				}
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}