
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 1;
		while (sc.hasNext()) {
			String s1 = sc.next();
			if (s1.equals("0")) {
				break;
			}
			System.out.println("Case "+counter+": "+s1);
			counter++;
		}
	}
}