import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		
		String result = S.replaceFirst(S.substring(K-1, K), S.substring(K-1, K).toLowerCase());
		System.out.println(result);		
	}
}

