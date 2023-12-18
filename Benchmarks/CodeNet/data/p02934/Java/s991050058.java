import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		double ans = 1 / Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::valueOf).map(e -> 1d / e).sum();
		System.out.println(ans);
	}
}
