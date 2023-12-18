import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		String s = in.nextLine();
		String t = in.nextLine();
		in.close();
		int mth = num;
		boolean mn = true;
		for (int i = 0; i < num; i++) {
            if (!mn) {
				if (s.charAt(i) != t.charAt(i-mth)) {
					mn = false;
					mth = num;
				} else {
					;
				}
			}
            if (mn) {
				if (s.charAt(i) == t.charAt(0)) {
					mth = i;
					mn = true;
				} else {
					;
				}
			}
		}
		System.out.println(num + mth);
	}
}
