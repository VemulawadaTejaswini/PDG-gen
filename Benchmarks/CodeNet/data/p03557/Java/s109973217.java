import java.util.Arrays;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long[] a = new Long[n];
		Long[] b = new Long[n];
		Long[] c = new Long[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextLong();
		}
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextLong();
		}

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

//		System.out.println(n);
//		for (Long string : a) {
//			System.out.println(string);
//		}
//		for (Long string : b) {
//			System.out.println(string);
//		}
//		for (Long string : c) {
//			System.out.println(string);
//		}

		int count = 0;
		int n1 ,n2;

		// 1段目の値
		for (int i = 0; i < n; i++) {
//			System.out.println("a[i]:"+a[i]);

			// 2段目の開始の要素を取得し、ループ開始
			n1 = binarySearch(a[i], b);
//			System.out.println("b[n1]:"+b[n1]);
			for (int j = n1; j < n; j++) {

				/*
				 * 2段目の値と3段目の値を比較
				 * 全体の要素数 - 2分探索値が条件を満たす個数
				 */
				n2 = binarySearch(b[j], c);
				int sum = n - n2;
//				System.out.println("sum:"+sum);
				count += sum;

			}
		}

//		System.out.println("count:"+count);
//		System.out.println(count);
	}

//	public static void main(String[] args) {
//		long v = 10L;
//		Long[] c = {9L,9L}; //=>2
//		Long[] c2 = {19L,19L}; //=>0
//		Long[] c3 = {9L,19L}; //=>1
//		Long[] c4 = {1L,10L,19L}; //=>0
//		Long[] c5 = {10L,11L,19L}; //=>0
//		System.out.println(binarySearch(v, c));
//		System.out.println(binarySearch(v, c2));
//		System.out.println(binarySearch(v, c3));
//		System.out.println(binarySearch(v, c4));
//		System.out.println(binarySearch(v, c5));
//	}

	private static int binarySearch(long key, Long[] compareVaules) {

		int left = 0;
		int right = compareVaules.length;
		int mid;

		while (left < right) {
			mid = (left + right) / 2;
//			System.out.println("[bf]left:"+left+",mid:"+mid+",right:"+right);
//			System.out.println("key:"+key+",value:"+compareVaules[mid]);
			if (key == compareVaules[mid]) {
				return mid+1;
			} else if (key < compareVaules[mid]) {
				right = mid;
			} else {
				left = mid + 1;
			}
//			System.out.println("[af]left:"+left+",mid:"+mid+",right:"+right);
//			System.out.println("------------------");
		}
		return right;
	}
}
