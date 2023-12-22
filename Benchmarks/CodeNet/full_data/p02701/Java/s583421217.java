import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		HashSet<String> result = new HashSet<String>(N);

		for (int i = 0; i < N; i++) {
			String S = scan.next();
			result.add(S);
		}
		

		System.out.println(result.size());

	}

}