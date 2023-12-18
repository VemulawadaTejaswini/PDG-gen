import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a=scan.nextLong();
		long b=scan.nextLong();
		if((a+b)%2==0) System.out.println((a+b)/2);
		else System.out.println("IMPOSSIBLE");
	}

}
