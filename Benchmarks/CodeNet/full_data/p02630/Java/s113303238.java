import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		long sum = 0;
		long[] numsMap = new long[100000];
		for (int i : line) {
			numsMap[i - 1]++;
			sum += i;
		}
		int round = sc.nextInt();

		int[] replace_line = new int[2];

		for (int i = 0; i < round; i++) {
			replace_line[0] = sc.nextInt();
			replace_line[1] = sc.nextInt();
			if (numsMap[replace_line[0] - 1] > 0) {
				sum = sum - replace_line[0] * numsMap[replace_line[0] - 1] + replace_line[1] * numsMap[replace_line[0] - 1];
				System.out.println(sum);
				long let = numsMap[replace_line[0] - 1];
				if (numsMap[replace_line[1] - 1] > 0) {
					let += numsMap[replace_line[1] - 1];
				}
				numsMap[replace_line[1] - 1] = let;
				numsMap[replace_line[0] - 1] = 0;
			}else {
				System.out.println(sum);
			}

		}

	}

}