import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int r = Math.min(a*n, b);
		System.out.println(r);
	}
}
