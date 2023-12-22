import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		if(s.equals("ABC")){
			System.out.println("ARC");
		} else if(s.equals("ARC")){
			System.out.println("ABC");
		}
	}
}
