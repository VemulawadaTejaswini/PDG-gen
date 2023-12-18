import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int h = sc.nextInt();
		final int w = sc.nextInt();

		List<String> aList = new ArrayList<>();

		for (int i = 0; i < h; i++) {
			aList.add("#" + sc.next() + "#");
		}

		sc.close();

		String wresult = String.join("", Collections.nCopies(w, "#"));

		wresult = wresult + "##";

		System.out.print(wresult);
		for (final String a : aList) {
			System.out.print(a);
		}
		System.out.print(wresult);

	}

}