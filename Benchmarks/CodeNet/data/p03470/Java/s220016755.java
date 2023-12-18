import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int waruketa = 1;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int N = scn.nextInt();
		for (int i = 0; i < N; i++) {
			list.add(scn.nextInt());
		}

		for (int i = 0; i < list.size(); i++) {
			int x = list.get(i);
			for (int j = 0; j < i-1;) {
				if (x == list.get(j)) {
					list.remove(j);
					continue;
				}
				j++;
			}
			for (int j = i+1; j < list.size();) {
				if (x == list.get(j)) {
					list.remove(j);
					continue;
				}
				 j++;
			}
		}
		System.out.println(list.size());
	}
}
