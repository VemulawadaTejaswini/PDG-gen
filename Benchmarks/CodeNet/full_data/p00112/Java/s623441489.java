import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>(10000);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt());
				Collections.sort(list);
			}

			int pre_num = 0;
			int mati = 0;
			int sum = 0;
			for (int i : list) {
				mati += pre_num;
				sum += mati;
				pre_num = i;
			}

			System.out.println(sum);
		}

	}
}