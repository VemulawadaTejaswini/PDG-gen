
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author ??\???
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner("in1.txt");
		int arg = scanner.nextInt();
		System.out.println((int)Math.pow(arg, 3));
		scanner.close();
	}

}