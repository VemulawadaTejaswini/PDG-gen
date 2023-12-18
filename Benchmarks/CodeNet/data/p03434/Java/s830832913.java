import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt( sc.nextLine());

		Integer a[] = Stream.of(sc.nextLine().split(" ", n))
				.map(s -> Integer.parseInt(s))
				.toArray(Integer[]::new);

		Arrays.sort(a , Comparator.reverseOrder());

		int gap = 0;

		for (int i = 0; i < a.length; i++) {
			if (i % 2 ==0) {
				gap += a[i];
			} else {
				gap -= a[i];

			}

		}
		System.out.println(gap);


	}

}