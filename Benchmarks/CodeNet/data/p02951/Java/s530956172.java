
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();

			int capacity = a - b;
			int zan = c - capacity;
			if(zan < 0) {
				zan = 0;
			}
				System.out.println(zan);

	}

}
