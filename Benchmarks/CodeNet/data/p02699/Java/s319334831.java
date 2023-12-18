import java.util.Scanner;

public class Main {
	public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int w = scan.nextInt();
		String ans = "safe";
		
		if(s <= w) {
			ans = "unsafe";
		}

		System.out.println(ans);
	}
}