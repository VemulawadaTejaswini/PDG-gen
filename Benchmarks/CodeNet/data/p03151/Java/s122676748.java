import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] d = new int[N];
		boolean[] vis = new boolean[N];
		int Sa = 0;
		int Sb = 0; //Total sums of arrays
		int ans = 0;
		for (int i = 0; i < N; i++) {
			a[i]=input.nextInt();
			Sa+=a[i];
		}
		for (int i = 0; i < N; i++) {
			b[i]=input.nextInt();
			Sb+=b[i];
		}
		if (Sb>Sa) ans=-1;
		else {
			for (int i = 0; i < N; i++) {
				d[i]=a[i]-b[i];
			}
			Arrays.sort(d);
			int L = 0;
			int R = N-1;
			while (true) {
				if (d[L]>=0) break;
				int min = Math.min(Math.abs(d[L]), d[R]);
				d[L]+=min;
				d[R]-=min;
				if (!vis[L]) ans++;
				if (!vis[R]) ans++;
				vis[L]=true;
				vis[R]=true;
				if (d[R]==0) R--;
				if (d[L]==0) L++;
			}
		}
		System.out.println(ans);
	}
}