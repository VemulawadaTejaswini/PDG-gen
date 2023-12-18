import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s  = sc.next();
		String t  = sc.next();
		String res = "No";
		String s2 = s;
		while (true) {
			s2 = s2.substring(s2.length()-1, s2.length()) + s2.substring(0, s2.length()-1);
			if (t.equals(s2)) {
				res = "Yes";
				break;
			}else if (s.equals(s2)) {
				break;
			}
		}
		System.out.println(res);
	}
}
