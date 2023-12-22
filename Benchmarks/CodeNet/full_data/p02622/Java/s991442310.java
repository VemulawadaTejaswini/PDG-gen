import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next(), b = scan.next();
		int count  = 0;
		
		for(int i = 0; i < a.length(); i++) {
			if(!a.substring(i, i + 1).equals(b.substring(i, i + 1))) {
				count++;
				
			}
			
		}
		
		System.out.println(count);


	}


}