import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long b = scan.nextLong();
		long r = scan.nextLong();
		
		long count = n/(r+b);
		long rest = Math.min((n%(r+b)),b);
		
        System.out.println(count * b + rest);

	}
}