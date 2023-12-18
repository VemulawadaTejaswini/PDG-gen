import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[M+2];
		
		a[0] = -1;
		a[M+1] = N+1;
		for(int i=1; i<=M; i++) {
			a[i] = sc.nextInt();
		}
		
		//差を計算
		int[] del = new int[M+1];
		boolean flag = false;
		for(int i=0; i<=M; i++) {
			del[i] = a[i+1] -  a[i] -2;
			if(del[i]<0) {flag = true;}
		}
		
		//fib
		long[] f = new long[100010];
		f[0] = 1;
		f[1] = 1;
		for(int i=0; i<100000; i++) {
			f[i+2] = f[i+1] + f[i];
		}
		
		long ans = 1;
		if(flag==false) {
			for(int i=0; i<=M; i++) {
				ans *= f[del[i]];
			}
		}
		
		//System.out.println(ans);
		ans = ans % 1000000007;
		//System.out.println(ans);
		
		if(flag==false) {
			System.out.println(ans);
		}else {
			System.out.println(0);
		}
	}
}
