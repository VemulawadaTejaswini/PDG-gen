import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int len = line[0];
		int k = line[1];
		long points = 1;
		long[] score = Stream.of(sc.nextLine().split(" ", 0)).mapToLong(Long::parseLong).toArray();
		for (int i = 0; i < k; i++) {
			points *= score[i];
		}

		long let = 1;
		for (int i = k; i < len; i++) {
			let = 1;
			let = points / score[i - k] * score[i];
			if (let > points) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			points = let;
		}
	}

}