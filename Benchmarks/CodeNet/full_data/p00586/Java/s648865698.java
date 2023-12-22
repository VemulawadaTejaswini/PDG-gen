import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int a = scan.nextInt();
			if(a == null) break;

			System.out.println( a + scan.nextInt());
		}
	}
}