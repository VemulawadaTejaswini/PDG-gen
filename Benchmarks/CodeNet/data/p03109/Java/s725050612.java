import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] s = S.split("/");
		int y = Integer.parseInt(s[0]);
		int m = 0;
		if(s[1].charAt(0) == '0') {
			m = Integer.parseInt(s[1].substring(1, 2));
		}else {
			m = Integer.parseInt(s[1]);
		}
		int d = 0;
		if(s[2].charAt(0) == '0') {
			d = Integer.parseInt(s[2].substring(1, 2));
		}else {
			d = Integer.parseInt(s[2]);
		}
		if(m <= 4) {
			System.out.println("Heisei");
		}else {
			System.out.println("TBD");
		}
	}
}