
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<String>();
		int times = sc.nextInt();
		for (int i = times; i > 0; i--) {
			list.add(sc.next());
		}
		Collections.sort(list);
		System.out.println(list.getFirst());
	}
}