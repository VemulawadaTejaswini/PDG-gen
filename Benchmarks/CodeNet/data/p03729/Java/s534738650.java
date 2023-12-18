import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b = s.nextLine();
		String c = s.nextLine();
		boolean ans = false;
		if(a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}