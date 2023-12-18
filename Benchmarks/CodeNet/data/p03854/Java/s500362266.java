import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int position =0;
		while (position<s.length()) {
			if (position+5<s.length()) {
				System.out.println("NO");
				return ;
			}
			if ("dream".equals(s.substring(position,position+5))==false&&"erase".equals(s.substring(position,position+5))==false) {
				System.out.println("NO");
				return ;
			}
			position+=5;
			if (position<s.length()) {
				if (s.charAt(position)=='r') {
					position++;
				}
			}
		}
		System.out.println("YES");
	}
}