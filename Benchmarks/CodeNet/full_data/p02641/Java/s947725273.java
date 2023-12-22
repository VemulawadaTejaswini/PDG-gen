import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int N = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(scan.nextInt());
		}
		if (!(hasListX(list, X))) {
			System.out.println(X-1);
		} else {
			List<Integer> forbiddenList = new ArrayList<Integer>();
			forbiddenList = createForbiddenList(list);
			int result = search(forbiddenList, X);
			System.out.println(result);
		}
	}

	public static boolean hasListX(List<Integer> list, int X) {
		boolean b = true;
		for (int a : list) {
			if (X == a) {//listがXを含んでいる
				b = true;//trueが帰ってきて、X以外の値が答えになる。
				break;
			} else {
				b = false;
			}
		}
		return b;
	}

	public static List<Integer> createForbiddenList(List<Integer> list) {
		List<Integer> allList = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			allList.add(i + 1);
		}
		List<Integer> forbiddenList = new ArrayList<Integer>();
		for (int a : allList) {
			int c = 0;
			for (int b : list) {
				if (a == b) {
					c++;
				}
			}
			if (c == 0) {
				forbiddenList.add(a);
			}
		}
		return forbiddenList;
	}

	public static int search(List<Integer> list, int x) {
		int min = 100;
		int idx = 0;
		for (int a : list) {
			if (Math.abs(a - x) < min) {
				idx = a;
				min = Math.abs(a - x);
			}
		}
		return idx;
	}

}
