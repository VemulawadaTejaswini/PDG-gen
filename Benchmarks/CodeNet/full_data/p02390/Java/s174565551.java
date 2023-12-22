
import java.util.Scanner;

/**
 * @author ??\???
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		scanner.close();
		
		int h = s / 60 / 60;
		s = s - h * 60 * 60;
		int m = s / 60;
		s = s- m * 60;
		
		System.out.println(h + ":" + m + ":" + s);
	}

}