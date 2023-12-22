import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int k = stdIn.nextInt();
		String s = stdIn.next();
		
		if(s.length() <= k) {
			System.out.println(s);
		}else {
			System.out.println(s.substring(0,k)+"...");
		}
		
		
		
		
		
	}

}
