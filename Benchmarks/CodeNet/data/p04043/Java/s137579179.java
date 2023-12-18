import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		List<String> sList = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			sList.add(sc.nextLine());
		}
		Collections.sort(sList);
		sc.close();
	}
}
