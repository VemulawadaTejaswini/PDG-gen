
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		scan.close();

		int minDistance753 = 999;

		for(int i=0; i<S.length(); i++) {
			int endindex = i+3;
			if(S.length()-1 < i+3) {
				endindex = S.length();
			}
			int X = Integer.parseInt(S.substring(i, endindex));
			int distance753 = Math.abs(X - 753);
			if(distance753 < minDistance753) {
				minDistance753 = distance753;
			}
		}
		System.out.println(minDistance753);
	}

}
