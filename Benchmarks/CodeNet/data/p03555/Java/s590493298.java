import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		char[] c = s1.toCharArray();

		System.out.println((("" + c[2] + c[1] + c[0]).equals(s2)) ? "YES" : "NO");

		sc.close();


	}

}


