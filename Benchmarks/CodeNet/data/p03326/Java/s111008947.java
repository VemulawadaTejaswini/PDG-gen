import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];

		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}

		long ppp=calc(1,1,1,a,b,c,m,n);
		long ppm=calc(1,1,-1,a,b,c,m,n);
		long pmp=calc(1,-1,1,a,b,c,m,n);
		long mpp=calc(-1,1,1,a,b,c,m,n);
		long pmm=calc(1,-1,-1,a,b,c,m,n);
		long mpm=calc(-1,1,-1,a,b,c,m,n);
		long mmp=calc(-1,-1,1,a,b,c,m,n);
		long mmm=calc(-1,-1,-1,a,b,c,m,n);

		long max = Math.max(Math.max(Math.max(ppp,ppm),Math.max(pmp,mpp)),Math.max(Math.max(pmm,mpm),Math.max(mmp,mmm)));

		System.out.println(max);


	}

	public static long calc(int p,int q,int r,int[] a,int[] b,int[] c,int m,int n){
		int sum[] = new int[n];
		for(int i=0;i<n;i++){
			sum[i] = p*a[i] + q*b[i] + r*c[i];
		}
		Arrays.sort(sum);

		long all = 0;
		for(int i=n-1;i > n-m-1;i--){
			all += sum[i];
		}

		return all;
	}
 
}