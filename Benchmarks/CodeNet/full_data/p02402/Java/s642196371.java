import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int min = 0, max = 0, sum = 0;
		ArrayList<Integer> elems = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			int elem = scan.nextInt();
			elems.add(elem);
			sum+=elem;
		}
		scan.close();
		Collections.sort(elems);
		min = elems.get(0);
		max = elems.get(elems.size() - 1);
		System.out.println(min + " " + max + " " + sum);
	}
}