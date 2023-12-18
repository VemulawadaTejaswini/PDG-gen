import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		String name = null;
		ArrayList<String> S = new ArrayList<String>();

		for (int i = 0; i < N; i++) {
			 name = scan.next();
			 for (int j = 0; j <= S.size(); j++) {
				 if (!S.contains(name)) {
					 S.add(name);
				 }
			 }

		}

		System.out.println(S.size());
	}

}