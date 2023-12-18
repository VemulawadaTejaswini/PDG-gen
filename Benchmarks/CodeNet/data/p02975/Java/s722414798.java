import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numN = s.nextInt();
		long[] nums = new long[numN];
		for (int i = 0; i < numN; i++) {
			nums[i] = s.nextInt();
		}
		String judge = "Yes";

		for (int i = 0; i < numN; i++) {
			long numA = 0;
			long numB = 0;
			if (i == 0) {
				numA = nums[numN - 1];
				numB = nums[1];
			} else if (i == numN - 1) {
				numA = nums[numN - 2];
				numB = nums[0];
			} else {
				numA = nums[i - 1];
				numB = nums[i + 1];
			}
			long judgeAB = numA ^ numB;
			if (judgeAB != nums[i]) {
				judge = "No";
			}
		}
		if (judge.equals("No")) {
			for (int i = 0; i < numN - 1; i++) {
				for (int j = 0; j < numN - 1; j++) {
					for (int k = 1; k < j; k++) {
						long numC = nums[k] ^ nums[j];
						if (numC != nums[i]) {
							break;
						}
					}
				}
			}
			judge = "Yes";
		}

		System.out.println(judge);

	}

}
