
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		
		a = a % 10;
		
		if(a == 3) {
			System.out.println("bon");
		}
		else if(a == 0 || a == 1 || a == 6 || a == 8) {
			System.out.println("pon");
		}
		else {
			System.out.println("hon");
		}
	}

}
