import java.util.*;

// Tenakaichi 2017-D
// http://tenka1-2017.contest.atcoder.jp/tasks/tenka1_2017_d	

public class Main {

	public static void main (String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int K = in.nextInt();

		ArrayList<int[]> pattern = new ArrayList<int[]>();
		int[] binary = convertToBinary(K);
		for (int i = 0; i < 32; i++) {
			if (binary[i] == 1) {
				binary[i] = 2;
			}
		}
		pattern.add(binary);
		fillPattern(pattern, K);
		
		int[] nums = new int[N];
		int[] values = new int[N];
		
		for (int i = 0; i < N; i++) {
			nums[i] = in.nextInt();
			values[i] = in.nextInt();
		}
		
		long answer = 0;
		for (int i = 0; i < pattern.size(); i++) {
			long tempAnswer = 0;
//			System.out.printf("pattern: ");
//			printBinary(pattern.get(i));
			for (int j = 0; j < N; j++) {
				if (doesMatchPattern(pattern.get(i), nums[j])) {
					tempAnswer += values[j];
				}
//				System.out.printf("num: %d, doesMatch: %s\n", nums[j], doesMatchPattern(pattern.get(i), nums[j]) ? "true" : "false");
			}
			answer = Math.max(answer, tempAnswer);
		}
		System.out.println(answer);
	}
	
	public static boolean doesMatchPattern(int[] pattern, int a) {
		for (int i = 0; i < 32; i++) {
			if (pattern[i] < 2) {
				if (((1 << i) & a) > 0 && pattern[i] == 0) {
					return false;
				}
				if (((1 << i) & a) == 0 && pattern[i] == 1) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void fillPattern(ArrayList<int[]> pattern, int a) {
		if (a > 0) {
			int index = 0;
			for (int i = 0; i <= 31; i++) {
				if (((1 << i) & a) > 0) {
					index = i;
					break;
				}
			}
			int[] binary = new int[32];
			binary[index] = 0;
			// Fill the right side of binary
			for (int i = 0; i < index; i++) {
				binary[i] = 2; // The bit containing 2 can be 1 or 0
			}
			
			// Fill the left side of binary
			for (int i = index + 1; i < 32; i++) {
				if (((1 << i) & a) > 0) {
					binary[i] = 2;
				}
			}
			
			pattern.add(binary);
			fillPattern(pattern, a - (1 << index));
		}
	}
	
	public static int[] convertToBinary(int a) {
		int[] binary = new int[32];
		int index = 0;
		while (a > 0) {
			binary[index] = a % 2;
			a /= 2;
			index++;
		}
		return binary;
	}
	
	public static void printBinary(int[] binary) {
		for (int i = 31; i >= 0; i--) {
			System.out.printf("%d", binary[i]);
		}
		System.out.println();
	}
	
}
