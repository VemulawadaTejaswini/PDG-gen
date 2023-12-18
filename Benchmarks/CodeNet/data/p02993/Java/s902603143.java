import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();

		String res = "Good";
		for(int i = 1; i < S.length(); i++) {
			if(S.charAt(i) == S.charAt(i - 1)) {
				res = "Bad";
				break;
			}
		}
		
		System.out.println(res);
		scan.close();
	}

}