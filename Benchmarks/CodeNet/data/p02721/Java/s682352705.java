import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int c = sc.nextInt();
		String s = sc.next();
		sc.close();

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals("o")) {
				list.add(i + 1);
			}
		}

		ArrayList<Integer> listK1 = new ArrayList<Integer>();
		int nextDay = 1;
		for (int i = 0; i < list.size(); i++) {
			int day = list.get(i);
			if (day >= nextDay) {
				listK1.add(day);
				nextDay = day + c + 1;
			}
		}

		ArrayList<Integer> listK2 = new ArrayList<Integer>();
		int prevDay = n;
		Collections.reverse(list);
		for (int i = 0; i < list.size(); i++) {
			int day = list.get(i);
			if (day <= prevDay) {
				listK2.add(day);
				prevDay = day - c - 1;
			}
		}
		Collections.reverse(listK2);

		for (int i = 0; i < Math.min(k, listK1.size()); i++) {
			int k1 = listK1.get(i);
			int k2 = listK2.get(i);
			if (k1 == k2) {
				System.out.println(k1);
			}
		}
	}
}