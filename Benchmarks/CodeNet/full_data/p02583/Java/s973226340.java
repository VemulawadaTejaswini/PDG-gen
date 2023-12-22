import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int l = sc.nextInt();
			list.add(l);
		}
		sc.close();

		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				for (int k = j + 1; k < list.size(); k++) {
					int first = list.get(i);
					int second = list.get(j);
					int third = list.get(k);
					if (first == second || second == third || third == first) {
						continue;
					}
					if (isTriangle(list.get(i), list.get(j), list.get(k))) {
						count++;
					}
				}
			}
		}
		print(count);
	}

	public static boolean isTriangle(int i, int j, int k) {
		int max = Math.max(i, j);
		max = Math.max(max, k);
		if (i + j + k - max > max) {
			return true;
		}
		return false;
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
