
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	void compute() {
		int n = scan.nextInt();
		int d = scan.nextInt();
		
		System.out.println(n % (d * 2 + 1) == 0 ? n / (d * 2 + 1) : n / (d * 2 + 1) + 1);
	}
	
	
	public static void main(String...arg) {
		new Main().compute();
	}
}
