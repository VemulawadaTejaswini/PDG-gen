import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next().replaceAll("\\?", ".");
		String t = sc.next();
		int ns = s.length();
		int nt = t.length();
		for(int i = ns - nt ; i >= 0 ; i--) {
			String regex = s.substring(i, i + nt);
			if(t.matches(regex)) {
				System.out.println(s.replaceFirst(s.substring(0, i) + regex, s.substring(0, i) + t).replaceAll("\\.", "a"));
				return;
			}
		}
		System.out.println("UNRESTORABLE");
	}
}