import java.util.*;

public class Main {
	public static void main(String[] orgs) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextln();
		int L = S.length() - 2;
		int size = S.length();
		int cut_length = 1;
		System.out.println(S.charAt(1) + L + S.substring(size - cut_length));
	}
}