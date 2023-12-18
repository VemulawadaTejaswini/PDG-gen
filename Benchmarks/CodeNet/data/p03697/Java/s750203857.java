
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int w = s.nextInt();
		if (h + w < 10) {
			int a = h + w;
			System.out.println(a);
		} else {
			System.out.println("error");
		}

	}

}