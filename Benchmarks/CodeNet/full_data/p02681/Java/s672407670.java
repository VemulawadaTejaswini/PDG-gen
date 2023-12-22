import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		  
		String s = stdIn.next();
		String t = stdIn.next();
		
		String tt = t.substring(0,t.length()-1);
		
		if(s.equals(tt)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}
