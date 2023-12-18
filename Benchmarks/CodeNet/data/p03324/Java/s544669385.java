import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int d = stdIn.nextInt();
		int n = stdIn.nextInt();
		
		if(n==100) {
			n =101;
		}
		
		if(d==0) {
			System.out.println(n);
		}
		else {
			System.out.println(100*n);
		}
		
		
	}
}