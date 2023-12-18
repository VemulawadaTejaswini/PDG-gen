
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		scan.close();
		System.out.println((a>=n%500)? "Yes":"No");
	}

}
