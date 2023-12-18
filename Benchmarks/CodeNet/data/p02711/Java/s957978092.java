import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		
		n.replaceAll("7",  "");
		
		if(n.length() == 3) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}
}
