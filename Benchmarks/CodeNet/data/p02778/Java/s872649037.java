import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String s = "";
		for (int i = 0; i < S.length(); i++) {
			s += "x";
		}
		System.out.println(s);
	}

}
