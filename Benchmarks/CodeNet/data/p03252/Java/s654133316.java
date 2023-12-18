import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		boolean b = true;
		for(int i = 0; i < s.length() && b; i++)
			b &= s.indexOf(s.charAt(i), i+1) == t.indexOf(t.charAt(i), i+1) ;
		System.out.println(b ? "Yes" : "No");
	}
}
