import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String a = s.substring(0, 1);
		String b = String.valueOf(s.length() - 2);
		String c = s.substring(s.length() - 1, s.length());
		
		System.out.println(a + b + c);
		
	}
}
