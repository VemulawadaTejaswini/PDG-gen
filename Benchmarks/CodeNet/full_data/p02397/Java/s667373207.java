import java.util.Arrays;
import java.util.Scanner;

public class ITP1_3_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		for (int i = 1; i < 3000; i++) {

			String[] n = line.split(" ");

			Arrays.sort(n);
			System.out.println(n[0] + " " + n[1]);

			if (n[0] == "0" && n[1] == "0") {
				break;

			}


		}
	}

}

