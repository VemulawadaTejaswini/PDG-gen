import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
        
        System.out.println(s.equals("AAA")||s.equals("BBB")?"No":"Yes");
		
	}
}