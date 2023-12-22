import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		String p = scan.next();
		
		s = s.concat(s);
		int num = s.indexOf(p);
		
		if(num != -1) System.out.println("Yes");
		else          System.out.println("No");
		
		scan.close();
	
		
	}

}