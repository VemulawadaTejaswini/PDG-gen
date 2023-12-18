import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String[] a = scanner.next().split("");
		String[] b = scanner.next().split("");
		String[] c = scanner.next().split("");
		String ans = "";

		if (a[a.length - 1].equals(b[0]) && b[b.length - 1].equals(c[0])) {
			ans = "YES";
		} else {
			ans = "NO";
		}

		System.out.println(ans);
	}
}
