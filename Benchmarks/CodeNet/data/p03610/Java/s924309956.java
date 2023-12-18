import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		char[] array = new char[S.length()];
		for(int i=0;i<S.length();i+=2) {
			System.out.print(S.charAt(i));
		}
		//System.out.println(Math.pow(4, 8));

	}
	public static int sample() {
		return 1;
	}

}
