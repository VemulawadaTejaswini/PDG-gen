import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] s = new int[n + 1];		// ????????¨???????°?????????¨?????¨???????????????
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}

		int q = sc.nextInt();
		int[] t = new int[q];
		for (int i = 0; i < q; i++) {
			t[i] = sc.nextInt();
		}
		sc.close();

		int count = 0;
		for(int sagasu : t) {
			if(binarySearch(s, sagasu) != -1) count++;
		}

		System.out.println(count);
	}

	private static int binarySearch(int[] ary, int target) {
		int low = 0;
		int high = ary.length-1;
		int mid = (low + high) / 2;

		while(low < high) {

			if(ary[mid] == target) return mid;

			if(ary[mid] < target) {
				low = mid + 1;
			} else {
				high = mid;
			}
			mid = (low + high) / 2;

		}
		return -1;
	}
}