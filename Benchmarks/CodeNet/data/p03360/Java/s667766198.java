import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int abc[] = new int[3];
		for (int i = 0; i < 3; i++) {
			abc[i] = sc.nextInt();
		}
		int K = sc.nextInt();
		Arrays.sort(abc);
		for (int i = 1; i <= K; i++) {
			abc[2] = abc[2] * 2;
		}
		System.out.println(abc[0] + abc[1] + abc[2]);
	}
}