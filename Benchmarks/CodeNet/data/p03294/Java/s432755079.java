import java.util.Arrays;
import java.util.Scanner;
public class Main { //C

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];

		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
		}Arrays.sort(a);
		int amax = a[N-1];

		int[] ans = new int[amax];
		for(int j=0; j<amax; j++) {
			for(int k=0; k<N; k++) {
				ans[j] += k % a[k];
			}
		}Arrays.sort(ans);
		System.out.println(ans[amax-1]);
	}

}
