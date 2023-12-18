import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		scan.close();
		int x=n*800;
		int y=200*(n/15);
		System.out.println(x-y);
	}
}