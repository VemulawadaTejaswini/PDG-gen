import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		StringBuilder sb = new StringBuilder(S);
		sb.replace(3, 4, "8");
		System.out.println(sb.toString());
	}
}