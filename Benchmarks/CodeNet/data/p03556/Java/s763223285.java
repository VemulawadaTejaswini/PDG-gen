
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i = N; i > 0; i--) {
			if(Math.sqrt(i) - (int)Math.sqrt(i) == 0) {
				System.out.println(i);
				break;
			}
		}
		scan.close();

	}

}
