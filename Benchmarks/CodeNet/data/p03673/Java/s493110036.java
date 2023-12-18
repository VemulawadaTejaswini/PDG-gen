import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<String> array = new ArrayList<String>();
		ArrayList<String> List = new ArrayList<String>();
		for (int i = 0; i < a; i++) {
			array.add(sc.next());
			Collections.reverse(array);
		}
		for (int j = 0; j < a; j++) {
			if (j == a - 1) {
				System.out.println(array.get(j));
				return;
			}
			System.out.print(array.get(j) + " ");
		}
	}
}