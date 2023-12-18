import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		int key = Integer.parseInt(a + b);
		int[] n = new int[key];
		for (int i = 0; i < n.length; i++) {
			n[i] = i;
		}
		System.out.println(search(n, key, 0, n.length - 1) ? "Yes" : "No");
		sc.close();
	}

	static boolean search(int arr[], int key, int imin, int imax) {
		if (imax < imin) {
			return false;
		} else {
			int imid = imin + (imax - imin) / 2;
			if (arr[imid] * arr[imid] > key) {
				return search(arr, key, imin, imid - 1);
			} else if (arr[imid] * arr[imid] < key) {
				return search(arr, key, imid + 1, imax);
			} else {
				return true;
			}
		}
	}

}
