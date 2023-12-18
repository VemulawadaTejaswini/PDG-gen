import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int inM = in.nextInt();
		int inD = in.nextInt();
		System.out.println(solvex(inM, inD));
		in.close();
	}

	private static int solvex(int inM, int inD) {
		int r = 0;
		for (int d10 = 2; d10 <= inD / 10; d10++)
			for (int d1 = 2; d1 <= inD - d10 * 10; d1++)
				if (d10 * d1 <= inM)
					r++;
		return r;
	}
}
