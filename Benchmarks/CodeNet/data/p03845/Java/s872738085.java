import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		for(int i = 0;i < n ;i++) {
			t[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] p = new int[m];
		int[] x = new int[m];
		for(int k = 0;k < m ;k++) {
			p[k] = sc.nextInt();
			x[k] = sc.nextInt();
		}
		int[] sum = new int[m];
		for(int i = 0;i <m;i++) {
			for(int k =0; k < n;k++) {
				if(p[i]-1 == k)sum[i] +=x[i];
				else sum[i] += t[k];
			}
			System.out.println(sum[i]);
		}
	}

}
