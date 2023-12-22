import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int[] price = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();

		//0~line[0] - 1の部分集合をすべて求める
		int min = 10000000;
		for (int i = 0; i < (1 << line[0]); i++) {
			int con = 0;
			int sum = 0;
			for (int j = 0; j < line[0]; j++) {
				if (((i >> j) & 1) == 1) {
					con++;
					sum += price[j];
				}
			}
			if (con == line[1] && sum < min) {
				min = sum;
			}
		}

		System.out.println(min);

	}
}
