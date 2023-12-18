import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			list.add(x);
		}
		for (int i = 0; i < n; i++) {
			List<Integer> temp = new ArrayList<>(list);
			temp.remove(i);
			Collections.sort(temp);
			System.out.println(temp.get(n / 2 - 1));
		}
	}
}