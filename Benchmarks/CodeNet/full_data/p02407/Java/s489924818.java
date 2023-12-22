import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin = new Scanner((System.in));
		int n = stdin.nextInt();
		stdin.nextLine();
		if (n <= 100) {
			String input = stdin.nextLine();
			String[] inputs = input.split(" ");
			int[] ai = new int[n];
			boolean flag = false;
			for (int i = 0; i < ai.length; i++) {
				ai[i] = stdin.nextInt();
				if (ai[i] >= 0 && ai[i] <= 1000) {
					flag = true;
				} else {
					flag = false;
					break;
				}

			}
		}

	}
}