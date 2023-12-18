
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	
	void compute() {
		int r = scan.nextInt();
		int m = 3 * r * r;
		System.out.println(m);
	}

	public static void main(String[] args) {
		new Main().compute();
	}

}
