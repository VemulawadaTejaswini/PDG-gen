import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String O = sc.nextLine();
		String G = sc.nextLine();
		String ans = "";
		
		for (int i = 1; i <= O.length(); i++) {
			ans = ans + O.substring(i-1, i);
			if (i > G.length()) {
				break;
			}
			ans = ans + G.substring(i-1, i);
		}
		
		System.out.println(ans);
		sc.close();
	}
}
