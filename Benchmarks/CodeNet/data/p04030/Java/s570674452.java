import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		if (s.isEmpty()) {
			System.out.println("");
		} else {
			String ans = "";
			boolean check = true;
			for (int i = 0; i < s.length(); i++) {
				char ch1 = s.charAt(i);
				if (i > 0 && ch1 == 'B') {
					ans = ans.substring(0, ans.length() - 1);
					if (ans.isEmpty()) {
						System.out.println("");
						check = false;
						break;
					}
				} else {
					ans += ch1;
				}
			}
			if (check) {
				System.out.println(ans);
			}
		}
	}

}
