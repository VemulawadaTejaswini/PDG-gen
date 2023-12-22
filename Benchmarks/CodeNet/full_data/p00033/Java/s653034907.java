
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static List<Integer> lastNumList;
	static int n;
	static int count = 0;
	static Pair pair;

	public static void main(String[] args) {
		lastNumList = new ArrayList<>();
		lastNumList.add(0);
		n = sc.nextInt();
		pair = new Pair(0, 0);
		for (int i = 0; i < n; i++) {
//			System.out.println("dfs is " + i + "??????");
			dfs();
		}

	}

	public static void dfs() {
		if (count >= 10) {
			System.out.println("YES");
			init();
			return;
		}
		count++;

		// System.out.println(count);
		int nextNum = sc.nextInt();
//		System.out.println("nextNum is"+nextNum);

		if (nextNum - pair.left <= 0 && nextNum - pair.right <= 0) {
			System.out.println("NO");
			init();
			return;
		}

		// ?????£???????????§?????????
		if (nextNum - pair.left < 0 || nextNum - pair.right < 0) {
			if (nextNum - pair.left > 0) {
				pair.left = nextNum;
//				System.out.println(pair.left + " " + pair.right + "count:" + count);
				dfs();
				return;
			} else {
				pair.right = nextNum;
//				System.out.println(pair.left + " " + pair.right + "count:" + count);
				dfs();
				return;
			}
		}
		// ?????£????????\??????
		// ?????????????°???????
		if (nextNum - pair.left <= nextNum - pair.right) {
			pair.left = nextNum;
//			System.out.println(pair.left + " " + pair.right + "count:" + count);
			dfs();
			return;
		}
		// ?????????????°??????????
		if (nextNum - pair.right > 0 && nextNum - pair.left >= nextNum - pair.right) {
			pair.right = nextNum;
//			System.out.println(pair.left + " " + pair.right + "count:" + count);
			dfs();
			return;
		}
	
	}

	public static void init() {
		count = 0;
		pair.left = 0;
		pair.right = 0;
	}

}

class Pair {
	int left;
	int right;

	Pair(int a, int b) {
		left = a;
		right = b;
	}

}