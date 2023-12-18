import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] str = new long[n + 1];
		for (int i = 0; i < n; i++) {
			str[scan.nextInt()]++;
		}
		int count = 0;
		long sq = 1;
		for (int i = n; i >= 1; i--) {
			if (str[i] >= 2) {
				if (count == 0 && str[i] >= 4) {
					sq = i * i;
					break;
				}
				sq = sq * i;
				count++;
				if (count >= 2) {
					break;
				}
			}
		}
		if (count < 2) {
			System.out.println(0);
		} else {
			System.out.println(sq);
		}
	}
}