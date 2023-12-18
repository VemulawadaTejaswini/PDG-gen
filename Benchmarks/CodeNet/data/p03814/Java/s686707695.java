import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int firstIndex = S.indexOf("A");
		int lastIndex = S.indexOf("Z", firstIndex);
		System.out.println(S.substring(firstIndex, lastIndex + 1));
		sc.close();
	}
}