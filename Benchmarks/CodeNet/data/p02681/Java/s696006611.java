import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String T = sc.next();

		if(T.contains(S)){

			if (T.length() > S.length()){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		} else {
			System.out.println("No");
		}

	}

}
