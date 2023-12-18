import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String NM = scanner.nextLine();
		int N = Integer.parseInt(NM.split(" ")[0]);
		int sumA = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).sum();
		System.out.println(sumA > N ? -1 : N - sumA);
	}
}
