
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int k  = sc.nextInt();

		int a  = sc.nextInt();
		int b  = sc.nextInt();
		
		int di = a/k;
		int re = a%k;
		
		if( re != 0 ) di += 1;
		System.out.println( di*k <= b ? "OK" : "NG");
	}
	
	
}
