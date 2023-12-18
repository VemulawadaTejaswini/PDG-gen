import java.util.Scanner;


public class Main {
	public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt() * 2;
		int ans = 0;
		if(a > b) {
			ans = a - b;
		}
		System.out.println(ans);
	}
}