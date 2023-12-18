import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by mochizukimasao on 2017/09/22.
 *
 * @author mochizukimasao
 * @since version
 */
public class Main {
	
	static Scanner scanner = getScanner();
	
	public static void main(String[] args) {

		int total = scanner.nextInt();
		int second = scanner.nextInt();

		if (total < second) {
			System.out.println(0);
		} else {
			System.out.println(total - second);
		}
	}


	public static Scanner getScanner() {
		Scanner myScanner = null;
		try {
			myScanner = new Scanner(new FileInputStream("input.txt"));
		} catch (IOException e) {
			myScanner = new Scanner(System.in);
		}
		return myScanner;
	}
}
