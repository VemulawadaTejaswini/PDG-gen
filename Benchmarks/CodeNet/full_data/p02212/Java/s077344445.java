import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] r = new int[4];
		for (int i = 0; i < 4; i++) {
			r[i] = sc.nextInt();
		}
		Arrays.sort(r);
		System.out.println(Math.abs(r[0] + r[3] - r[1] - r[2]));
	}

}

