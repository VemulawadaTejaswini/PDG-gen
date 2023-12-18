import java.util.Scanner;

public class Main {
	static boolean[][] nodes;
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 頂点の数
		int m = sc.nextInt(); // 辺の数

		nodes = new boolean[n][n];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			nodes[a][b] = true;
			nodes[b][a] = true;
		}

		// printArray(nodes);

		boolean[] arrived = new boolean[n];

		move(arrived, 0);
		// move(arrived, 0, "");

		System.out.println(cnt);
		sc.close();
	}

	static boolean arrivedAllNodes(boolean[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i]) {
				return false;
			}
		}
		return true;
	}

	static boolean isAlreadyArrived(boolean[] arr, int n) {
		return arr[n];
	}

	static boolean[] copyArray(boolean[] arr) {
		boolean[] newArr = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}

	static void move(boolean[] arrived, int n) {
		boolean[] newArr = copyArray(arrived);
		if (newArr[n]) {
			return;
		} else {
			newArr[n] = true;
		}

		if (arrivedAllNodes(newArr)) {
			cnt++;
			return;
		}


		for (int i = 0; i < nodes[n].length; i++) {
			if (nodes[n][i]) {
				move(newArr, i);
			}
		}
		return;
	}

	static void move(boolean[] arrived, int n, String str) {
		str += n + 1;
		boolean[] newArr = copyArray(arrived);

		if (newArr[n]) {
			System.out.println(str + "x");
			return;
		} else {
			newArr[n] = true;
		}

		if (arrivedAllNodes(newArr)) {
			System.out.println(str);
			cnt++;
			return;
		}


		for (int i = 0; i < nodes[n].length; i++) {
			if (nodes[n][i]) {
				move(newArr, i, str);
			}
		}
		return;
	}

	static void printArray(boolean[][] arrs) {
		int i = 0;
		for (boolean[] arr : arrs) {
			System.out.print(i + " : {");
			for (int j = 0; j < arr.length; j++) {
				System.out.print((arr[j] ? 1 : 0) + ", ");
			}
			System.out.println("}");
		}
	}

}
