import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String p = sc.next();

		String word_chain = s + s;
		int judge = 0;

		judge = word_chain.indexOf(p);
		if (judge != -1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}

