import java.util.Scanner;

public class Main {
	public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		String ans = "Yes";
		int tka = 0;
		int ao = 0;
		
		while(c > 0) {
			c = c - b;
			tka++;
		}
		
		while(a > 0) {
			a = a - d;
			ao++;
		}
		
		if(ao < tka) {
			ans = "No";
		}

		System.out.println(ans);
	}
}