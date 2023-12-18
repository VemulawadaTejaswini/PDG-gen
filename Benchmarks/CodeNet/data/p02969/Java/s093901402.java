
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	void compute() {
		int r = scan.nextInt();
		System.out.println(3 * r * r);
	}
	
	
	public static void main(String...arg) {
		new Main().compute();
	}
}
