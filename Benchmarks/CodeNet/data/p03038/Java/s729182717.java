import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		long ans = 0;
		long[] a = new long[n];
		for(int i = 0;i <n; i++) {
			a[i] = scn.nextInt();
		}
		Arrays.sort(a);
		for(int i = 0;i<m;i++) {
			int b = scn.nextInt();
			int c = scn.nextInt();
			for(int j = 0; j<b;j++) {
				if(a[j]<c) {
					a[j]=c;
				}
			}
			Arrays.sort(a);
		}
		for(int i = 0;i <n; i++) {
			ans += a[i];
		}
		System.out.println(ans);
	}
}