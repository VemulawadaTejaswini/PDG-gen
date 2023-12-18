import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int num = Integer.parseInt(sc.nextLine());
		DecimalFormat df = new DecimalFormat("000");
		System.out.println("ABC" + df.format(num));
	}
}
