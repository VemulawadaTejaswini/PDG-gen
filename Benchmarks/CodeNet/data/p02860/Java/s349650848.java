import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();

		String ans = isEcho(sc.next()) ? "Yes" : "No";
		System.out.println(ans);
		sc.close();
	}

	static boolean isEcho(String s) {
		if (s.length() % 2 == 1)
			return false;

		String fh = s.substring(0, s.length() / 2);
		String lh = s.substring(s.length() / 2);

		if (fh.equals(lh))
			return true;
		else
			return false;
	}
}
