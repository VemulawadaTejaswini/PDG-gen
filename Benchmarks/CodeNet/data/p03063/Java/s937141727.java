import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		int cnt = 0;
		String rep = S.replaceAll("#", "");
		System.out.println(S.length() == rep.length() ? 0 : rep.length());
	}

}