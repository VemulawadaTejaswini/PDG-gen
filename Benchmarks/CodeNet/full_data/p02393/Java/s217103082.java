import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String[] b = x.split(" ");
		int[] e = new int[3];
		e[0] = Integer.parseInt(b[0]);
		e[1] = Integer.parseInt(b[1]);
		e[2] = Integer.parseInt(b[2]);
		Arrays.sort(e);
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);

		}

	}
}