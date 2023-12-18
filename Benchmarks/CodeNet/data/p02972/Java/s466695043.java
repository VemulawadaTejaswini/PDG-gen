import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n+1];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
			if(i > n/2) {
				b[i] = a[i];
			}
		}
		for(int i= n/2;i>0;i--) {
			if(a[i]==0) {
				b[i] = calc(i,n,b);
			}else {
				b[i] = Math.abs(calc(i,n,b)-1);
			}
			
		}
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum +=b[i];
		}
		System.out.println(sum);
		for(int i=1;i<=n;i++) {
			if(b[i] == 1) {
				System.out.println(i);
			}
		}
	}
	static int calc(int i,int n,int[] b) {
		int val = 0;
		for(int k = i*2;k<n;k=k+i) {
			val+=b[k];
		}
		val = val%2;
		return val;
	}
}