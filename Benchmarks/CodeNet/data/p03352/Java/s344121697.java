import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		for (int i = 2; i <= 31; i++) {
			for (int j = 2; j <= 9; j++) {
				if (Math.pow(i, j) <= 1000) {
					list.add((int) Math.pow(i, j));
				} else break;
			}
		}
		List<Integer> hashlist = new ArrayList<>(new HashSet<>(list));
		Collections.sort(hashlist);
		for (int i = 0; i < hashlist.size(); i++) {
			if (x == 1000) {
				System.out.println(1000); return;
			}
			if (hashlist.get(i) > x) {
				System.out.println(hashlist.get(i-1)); return;
			}
		}
	}
}