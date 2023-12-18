import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int fIndex = S.indexOf("A");
		int lIndex = S.lastIndexOf("Z");
		System.out.println(S.substring(fIndex, lIndex + 1).length());

	}
}