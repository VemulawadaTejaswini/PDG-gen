import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long b = scan.nextInt();
		long r = scan.nextInt();
		
		long count = n/(r+b);
		long rest = Math.min((n%(r+b)),b);
		
        System.out.println(count * b + rest);

	}
}