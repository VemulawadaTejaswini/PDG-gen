import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		for (int i = 0; i < s.length; i+=2) {
			System.out.print(s[i]);
		}
		System.out.println();
	}
}
