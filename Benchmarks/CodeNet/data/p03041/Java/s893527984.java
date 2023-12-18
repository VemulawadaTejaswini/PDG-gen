import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		String S = sc.next();
		System.out.println(S.substring(0, K - 1) + S.substring(K - 1, K).toLowerCase() + S.substring(K));
	}
}
