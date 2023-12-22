import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		do {
			list.add(scan.nextInt());
		} while (!list.contains(0));
		for (int i = 1; i < list.size(); i++) {
			System.out.printf("case %d: %d\n", i, list.get(i-1));
		}
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}