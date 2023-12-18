import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] N = new int[4];
	static {
		Arrays.setAll(N, i->sc.nextInt());
	}
	public static void main(String[] args) {
		Arrays.sort(N);
		if (Arrays.toString(N).equals("[1, 4, 7, 9]")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
