import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int day = Integer.parseInt(sc.next());
		int[] days = new int[day];
		int sum = 0;

		ArrayList<Work> w = new ArrayList<Work>();

		for (int i = 0; i < n; i++) {
			w.add(new Work());
			w.get(i).day = Integer.parseInt(sc.next());
			w.get(i).pay = Integer.parseInt(sc.next());
		}

		Collections.sort(w, new WorkComparator());


		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (w.get(i).day - 1 + j < day && days[w.get(i).day - 1 + j] == 0) {
					days[w.get(i).day - 1 + j] = w.get(i).pay;
					break;
				}
			}
		}

		for (int d : days) {
			sum += d;
		}
		System.out.println(sum);
	}
}

class Work {
	int pay;
	int day;
}

class WorkComparator implements Comparator<Work> {
	public int compare(Work a, Work b) {
		return a.pay < b.pay ? 1 : -1;
	}
}