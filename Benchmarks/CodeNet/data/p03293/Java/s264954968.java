import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String s = sc.nextLine().trim();
		final String t = sc.nextLine().trim();
		
		for (int i =0,len = s.length(); i<len; i++) {
			if (strShift(s, i).equals(t)) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
		sc.close();
	}
	
	private static String strShift(String s, int n) {
		n = n % s.length();
		return s.substring(s.length()-n, s.length()) + s.substring(0,s.length()-n);
	}
	
}
