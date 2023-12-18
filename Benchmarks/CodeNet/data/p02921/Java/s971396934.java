import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		String s2[] = s.split("");
		String t2[] = t.split("");
		int c = 0;
		for (int i = 0; i < s2.length; i++) {
			if (s2[i].equals(t2[i]))
				c++;
		}
		System.out.println(c);
	}
}