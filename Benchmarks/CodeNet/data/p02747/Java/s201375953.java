import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		s.replace("hi", "");
		
		System.out.println((s.length() == 0) ? "Yes" : "No");
	}
	
}
