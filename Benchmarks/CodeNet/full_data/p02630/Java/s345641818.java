import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		long sum = 0;
		int[] numsMap = new int[100000];
		for (int i : line) {
			numsMap[i]++;
			sum += i;
		}
		int round = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < round; i++) {
			int[] replace_line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
			if (numsMap[replace_line[0]] > 0) {
				sum = sum - replace_line[0] * numsMap[replace_line[0]] + replace_line[1] * numsMap[replace_line[0]];
				System.out.println(sum);
				int let = numsMap[replace_line[0]];
				if (numsMap[replace_line[1]] > 0) {
					let += numsMap[replace_line[1]];
				}
				numsMap[replace_line[1]] = let;
				numsMap[replace_line[0]] = 0;
			}else {
				System.out.println(sum);
			}

		}

	}

}