import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> x_p = new ArrayList<Integer>();
		List<Integer> x_n = new ArrayList<Integer>();
		int count = 0;
		int distance = 0;
		int max = 0;
		int min = 0;

		for (int i = 0; i < N; i++) {
			int tmp = sc.nextInt();
			if (tmp >= 0) {
				x_p.add(tmp);
			} else {
				x_n.add(Math.abs(tmp));
			}
		}

		Collections.sort(x_n);

		if (x_p.get(0) == 0) {
			count++;
			x_p.remove(0);
		}

		while (count != K) {
			if (x_p.size() != 0 && x_n.size() != 0) {
				if (x_p.get(0) < x_n.get(0)) {
					count++;
					max = x_p.get(0);
					x_p.remove(0);
				} else {
					count++;
					min = x_n.get(0);
					x_n.remove(0);
				}
			}
			else if(x_p.size() != 0) {
				count++;
				max = x_p.get(0);
				x_p.remove(0);
			}
			else {
				count++;
				min = x_n.get(0);
				x_n.remove(0);
			}
		}

		if (max > Math.abs(min)) {
			distance = max + min * 2;
		} else {
			distance = max * 2 + min;
		}
		//出力
		System.out.println(distance);

		sc.close();
	}

}
