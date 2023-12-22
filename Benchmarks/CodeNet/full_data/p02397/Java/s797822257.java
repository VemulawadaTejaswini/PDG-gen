import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		int x;
		int y;
		int temp;
		
		Scanner stdin = new Scanner(System.in);
		
		x = stdin.nextInt();
		y = stdin.nextInt();
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println(x + " " + y);
		
		stdin.close();
	}
	
}