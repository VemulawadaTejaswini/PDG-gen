import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> input = Arrays.asList(sc.nextLine().split(" "));
		Integer[] inputNum = (Integer[]) input.stream().map(in -> Integer.parseInt(in)).toArray();
		int sa = inputNum[1] - inputNum[0];
		int tall = 0;
		for (int i = 1; i <= sa; i++) {
			tall += i;
		}
		System.out.println(tall - inputNum[1]);
		sc.close();

	}
}
