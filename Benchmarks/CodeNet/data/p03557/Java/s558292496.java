import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			b[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			c[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(c);
		long ans = 0;
		for(int i = 0 ; i < n ; i++) {
			ans += binary_search(a, b[i]) * (n - binary_search(c, b[i] + 1));
		}
		System.out.println(ans);
	}

	// l, r: 端点を含まないので、探索範囲はl+1~r-1
	// イメージは探索範囲外を指で押さえていって、最終的に右指で押さえているインデックスを返す感じ
	public static long binary_search(int[] array, int target) {
		int l = -1;
		int r = n;
		while(r - l > 1) {
			int mid = (r + l) / 2;
			if(array[mid] < target) {
				l = mid;
			} else {
				r = mid;
			}
		}
		return r;
	}

}
