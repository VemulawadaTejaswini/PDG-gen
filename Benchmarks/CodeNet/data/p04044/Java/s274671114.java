import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Main {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int length = scan.nextInt();
		ArrayList<String> list = new ArrayList<String>(number);
		
		for (int i = 0; i < number; i++) {
			list.set(i,scan.nextLine());
		}
		Collections.sort(list);

		for (int i = 0; i < number; i++) {
			System.out.print(list.get(i));
		}
	}
}