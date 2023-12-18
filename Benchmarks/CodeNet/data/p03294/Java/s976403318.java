import java.util.Arrays;
import java.util.Scanner;
public class Main { //C

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int max = 1;

		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
			max *= a[i];
		}

		int[] ans = new int[max];
		for(int j=0; j<max; j++) {
			for(int k=0; k<N; k++) {
				ans[j] += j % a[k];
			}
		}Arrays.sort(ans);
		System.out.println(ans[max-1]);
	}

}
