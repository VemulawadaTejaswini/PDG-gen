
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// String line = br.readLine();
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = 3;
		if (a == b) {
			d = d - 1;
			if (b == c)
				
			{
				d = d - 1;
				
			}
		}
		else if (a == c)
			d=d-1;
		
			System.out.println(d);
	}
}