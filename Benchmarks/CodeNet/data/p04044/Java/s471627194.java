import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int L = scanner.nextInt();
		ArrayList<String> S = new ArrayList<String>();
		for(int i = 0; i <= N; i++) {
			S.add(scanner.nextLine());
		}
		scanner.close();

		Collections.sort(S);

		for(String str: S) {
			System.out.print(str);
		}

		System.out.println();

	}

}
