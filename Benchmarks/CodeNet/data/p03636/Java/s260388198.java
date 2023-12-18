import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sd = new Scanner(System.in);
		String s = sd.nextLine();
		
		int x = s.length();
		
		String f = s.substring(0, 1);
		String e = s.substring(x-1);
		
		System.out.println(f+x+e);
		
		
	}
	
	
}