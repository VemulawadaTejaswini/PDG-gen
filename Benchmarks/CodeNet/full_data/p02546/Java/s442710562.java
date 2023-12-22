import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		if(!S.substring(S.length() - 1, S.length()).equals("s")) {
			System.out.println(S + "s");
		}else {
			System.out.println(S + "es");
		}
	}
}