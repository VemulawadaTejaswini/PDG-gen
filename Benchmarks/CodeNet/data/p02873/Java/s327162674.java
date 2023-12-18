import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		String[] array = str.split("");

		String before = "";
		int smcount = 0;
		int grcount = 0;
		long ans = 0;

		for (int i = 0; i < array.length; i++) {

			String tmp = array[i];

			if (tmp.equals("<")) {
				if (before.equals(array[i])) {
					smcount++;
				} else {
					long sum = getArraySum(grcount, smcount);
					ans = ans + sum;
					smcount = 1;
					grcount = 0;
				}

				before = array[i];

			} else {
				if (before.equals(array[i])) {
					grcount++;
				} else {
					grcount = 1;
				}
				before = array[i];

			}
		}
		long sum = getArraySum(grcount, smcount);
		ans = ans + sum;
		System.out.println(ans);

	}

	private static long getArraySum(int a, int b) {
		long large = a > b ? a : b;
		long small = a < b ? a : b;

		small--;

		long lsum = large * (large + 1) / 2;
		long ssum = small * (small + 1) / 2;

		long sum = lsum + ssum;

		return sum;

	}

}
