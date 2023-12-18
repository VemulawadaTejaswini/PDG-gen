import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.nextLine();

		S = S.substring(1,K) + S.substring(K, K+1).toLowerCase() + S.substring(K+1 , S.length());

		System.out.println(S);
	}
}