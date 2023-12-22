import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer k = sc.nextInt();
		String s = sc.next();
		Integer n = s.length();
		
		if (n <= k) {
			System.out.println(s);
		} else {
			System.out.println(s.substring(0, k) + "...");
		}
	}
}