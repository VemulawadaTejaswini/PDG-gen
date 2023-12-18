import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		int[] As = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] numSOs = new int[N];
		for(int A: As) {
			numSOs[A - 1]++;
		}
		for(int numSO: numSOs) {
			System.out.println(numSO);
		}
	}
}
