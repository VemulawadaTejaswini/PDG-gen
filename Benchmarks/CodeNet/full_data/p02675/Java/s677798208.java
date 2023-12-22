import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] n = {1, 1, 0, 2, 0, 0, 1, 0, 1, 0};
		String a = sc.next();
		int b = Integer.parseInt(a.substring(a.length() - 1));

		System.out.println(n[b] == 0 ? "hon" : n[b] == 1 ? "pon" : "bon");
	}
}