import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String S = sc.next();
		sc.nextLine();
		int K = sc.nextInt();
		String answer = S.replaceAll(String.format("[^%s]", S.substring(K-1,K)), "*");
		System.out.println(answer);
	}
}
