import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int b = scan.nextInt();
		int r = scan.nextInt();
		
		int count = n/(r+b);
		int rest = Math.min((n%(r+b)),b);
		
        System.out.println(count * b + rest);

	}
}