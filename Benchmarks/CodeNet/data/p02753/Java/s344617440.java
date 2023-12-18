import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char[] c = s.toCharArray();
		Arrays.sort(c);
		if(c[0]==c[2]) System.out.println("No");
		else System.out.print("Yes");
	}
}
