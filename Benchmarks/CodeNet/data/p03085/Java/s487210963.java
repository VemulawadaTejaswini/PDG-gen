
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		if(c.equals("A"))System.out.println("T");
		if(c.equals("T"))System.out.println("A");
		if(c.equals("C"))System.out.println("G");
		if(c.equals("G"))System.out.println("C");
		
		
		
		sc.close();
	}

	
}
