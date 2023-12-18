import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		String[] str = N.split("");
		String s1, s2 = "";
		int cnt = 0;
		s1 = str[0];
		for (String a : str) {
			if (!((a.equals(s1) && !a.equals(s2)) || ((!a.equals(s1) && a.equals(s2))))) {
				cnt++;
				if (cnt > 2) {
					System.out.println("No");
					System.exit(0);
				}
			}
			if (!a.equals(s1) && s2.equals(""))
				s2 = a;
		}
		System.out.println("Yes");
	}
}