import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		for (int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
		}
		Arrays.sort(b);

		for (int i = 0; i < N; i++) {
			c[i] = sc.nextInt();
		}
		Arrays.sort(c);

		int ans = 0;
		for(int j=0;j<N;j++) {
			int i = binarysearch(a,b[j]);
			if(i != N && a[i] == b[j]) i--;
			int k = binarysearch(c,b[j]);
			if(k != N && c[k] == b[j]) k++;
//			System.out.println(i + " " + (N-k));
			ans += i * (N-k);
		}

		System.out.println(ans);
	}

	public static int binarysearch(int[] a,int x) {
		int left = 0;
		int right = a.length;
		while(left < right) {
			int mid = (left + right)/2;
			if(a[mid] == x) {
				return mid;
			}else if(x < a[mid]) {
				right = mid;
			}else {
				left = mid + 1;
			}
		}
		return right;
	}

}
