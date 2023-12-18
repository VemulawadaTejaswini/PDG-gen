import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		sc.close();

		StringBuilder sb = new StringBuilder();
		sb.append(T);
		sb.append(S);
		System.out.println(sb.toString());

	}

}