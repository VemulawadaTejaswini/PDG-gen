import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] d = Arrays.stream(sc.nextLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();

		Arrays.sort(d);

		if (d[N / 2 - 1] == d[N / 2]) {
			System.out.println(0);
		}
		else {
			System.out.println(d[N / 2] - d[N / 2 - 1]);
		}
	}
}