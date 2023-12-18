import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		if(n%2==0)System.out.println((b-a)/2);
		else {
			System.out.println((n-a>b-1)? b-1:n-a);
		}

	}

}