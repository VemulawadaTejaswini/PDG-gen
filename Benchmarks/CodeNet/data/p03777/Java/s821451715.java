import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String a = stdIn.next();
		String b = stdIn.next();
		
		if(a.equals("H") && b.equals("H")) { 
			System.out.println("H");
		}else if(a.equals("H") && b.equals("D")) {
			System.out.println("D");
		}else if(a.equals("D") && b.equals("H")) {
			System.out.println("D");
		}else {
			System.out.println("H");
		}
		
		
	}

}
