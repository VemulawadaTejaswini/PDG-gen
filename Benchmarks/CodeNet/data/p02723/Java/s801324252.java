import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] S = sc.next().split("");
		sc.close();
		if (S[2].equals(S[3]) && S[4].equals(S[5])) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
