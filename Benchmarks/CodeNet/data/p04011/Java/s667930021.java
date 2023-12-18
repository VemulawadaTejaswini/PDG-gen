import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int k=scanner.nextInt();
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		int ans =0;

		if(n <= k) {
			System.out.println(n*x);
		}
		else {
			System.out.println(k*x + (n-k)*y);
		}
	    scanner.close();
		}
}
