import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			Integer a = scan.nextInt();
			if(a == null) break;

			System.out.println( a + scan.nextInt());
		}
	}
}