import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try (Scanner sc = new Scanner(System.in);) {

			String n = sc.next();
			String m = sc.next();

			String[] ar = n.split("");
			String[] ar1 = m.split("");

			Arrays.sort(ar);
			Arrays.sort(ar1);

			boolean flag = true;
			for (int i = 0; i < ar.length; i++) {
				if (ar[i].equals(ar1[i])) {
					continue;
				} else {
					flag = false;
					break;
				}
			}

			if (n.equals(m) || flag) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}

	}
}
