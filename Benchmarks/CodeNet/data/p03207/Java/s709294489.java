import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		while (scan.hasNextLine()) {
			int num = scan.nextInt();
			arrayList.add(num);
		}

		int max = arrayList.get(1);
		int total = 0;
		for (int i = 1; i < arrayList.size(); i++) {
			int v = arrayList.get(i);
			if (v > max) {
				max = v;
			}
			total = total + arrayList.get(i);
		}
		total = total - (max / 2);
		System.out.println(total);

	}

}
