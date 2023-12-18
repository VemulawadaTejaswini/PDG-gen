import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static int lower_bound(int a[],int key) {
		int right=a.length;
		int left=0;
		while(right-left>1) {
			int mid=(right+left)/2;
			if(a[mid]<key) {
				left=mid;
			}
			else {
				right=mid;
			}
		}
		return left;
	}
	static int upper_bound(int a[],int key) {
		int right=a.length;
		int left=0;
		while(right-left>1) {
			int mid=(right+left)/2;
			if(a[mid]<=key) {
				left=mid;
			}
			else {
				right=mid;
			}
		}
		return left;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();

		int[] L = new int[n];

		for(int i = 0; i < n; i++) {
			L[i] = stdIn.nextInt();
		}

		Arrays.parallelSort(L);

		long cnt = 0;

		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n-1; j++) {

				int a = L[i] + L[j];

				cnt += lower_bound(L,a) - j;

			}
		}
		System.out.println(cnt);


	}

}

