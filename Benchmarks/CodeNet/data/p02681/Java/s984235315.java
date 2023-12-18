
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		String T = scan.nextLine();
		int flag = 0;

		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == T.charAt(i)) {
				continue;
			}else {
				flag = 1;
				break;
			}
		}

		if(flag == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		scan.close();
	}
}
