import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int D = scan.nextInt();
		int x = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		list.add(x);
		for (int i = 0; i < 10; i++) {
			calc(r, D, list, i);
		}
	}

	public static void calc(int r, int D, List<Integer> list, int i) {
		list.add((r * list.get(i)) - D);
		System.out.println(list.get(i + 1));
	}

}