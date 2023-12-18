import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h=scan.nextInt();
		int a=scan.nextInt();
		scan.close();
		System.out.println((h%a==0)? h/a:h/a+1);
	}
}