import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] steps = new int[] {1, 6, 9, 36, 81, 216, 729, 1296, 6561, 7776, 46656, 59049};

		int count = 0;
		int remain = n;
		while (remain > 0) {
			for (int i = steps.length - 1; i >= 0; i--) {
				int tmp = remain - steps[i];
				if (tmp >= 0) {
					if (i > 1 && tmp > steps[i-2]*3 && remain - steps[i-1] <= steps[i-1]*2) {
						i = i - 1;
					}
					count++;
					remain -= steps[i];
					break;
				}
			}
		}

		System.out.println(count);

	}


}