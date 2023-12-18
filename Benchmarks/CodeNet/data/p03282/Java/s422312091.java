import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String s = sc.next();
		sc.next();
		
		if(s.charAt(0) == '1') {
			System.out.println(s.charAt(1));
		} else {
			System.out.println(s.charAt(0));
		}
		
	}

}