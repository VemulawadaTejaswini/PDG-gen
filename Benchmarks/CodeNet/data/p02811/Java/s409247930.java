import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int x = scan.nextInt();
		scan.close();
		System.out.println((500*k>=x)? "Yes":"No");
	}
}