import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = 0;
		for (int i = a; i <= b; i++) {
			String[] s = String.valueOf(i).split("");
			if (s[0].equals(s[4]) && s[1].equals(s[3]))
				c++;
		}
		System.out.println(c);
	}
}