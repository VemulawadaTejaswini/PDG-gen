import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner	in = new Scanner(System.in);
		int N = in.nextInt();
		String S = in.next();
		
		boolean a;
		if (S.length() % 2 == 0) {
			a = S.substring(0, S.length()/2).equals(
					S.substring(S.length()/2, S.length()));
			
		} else {
			a = false;
		}
		String answer = (a) ? "Yes" : "No";
		System.out.println(answer);
	}

}
