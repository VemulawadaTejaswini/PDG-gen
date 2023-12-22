
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int late = Integer.parseInt(sc.nextLine());
		int kyuu = 8;
		for (int i = 599; i < 2000; i = i + 200) {
			if (late <= i) {
				System.out.println(kyuu);
				break;
			}
			kyuu--;
		}
	}

}