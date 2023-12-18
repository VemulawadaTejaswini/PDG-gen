
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		sc.nextLine();
		System.out.println(sc.nextLine().contains("Y")?"Four":"Three");
		
	}
}
