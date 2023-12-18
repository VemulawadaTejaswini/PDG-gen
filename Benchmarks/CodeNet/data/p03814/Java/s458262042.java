import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int firstIndex = S.indexOf("A");
		int lastIndex = S.lastIndexOf("Z");
		System.out.println(S.substring(firstIndex, lastIndex + 1).length());
		sc.close();
	}
}