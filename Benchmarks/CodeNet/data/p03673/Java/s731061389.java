import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Long> array = new ArrayList<Long>();
		long a = sc.nextLong();
		array.add(a);
		String result = "";
		for(int i = 1; i < n; i++) {
			a = sc.nextLong();
			array.add(a);
			Collections.reverse(array);
		}

		for(int i = 0; i < n; i++) {
			System.out.print(array.get(i));
			if(i != n-1) {
				System.out.print(" ");
			} else {
				System.out.print("\n");
			}
		}

	}
}
