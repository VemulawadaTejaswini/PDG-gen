import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] hills = new int[10];
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		for (int i = 0; i < 10; i++) {
			hills[i] = scanner.nextInt();
		}
		Arrays.sort(hills);
		printListOfTop3Hills(hills);
	}

	public static void printListOfTop3Hills(int[] hills) {
		for (int i = 9; i > 6; i--) {
			System.out.println(hills[i]);
		}
	}
}