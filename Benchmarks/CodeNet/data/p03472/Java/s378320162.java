import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h= sc.nextInt();
		long[] a=new long[n];
		long[] b=new long[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
			b[i]=sc.nextLong();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int minb=-1;
		for(int i=n-1;i>=0;i--) {
			if(b[i]<=a[n-1]) {
				minb=i;
				break;
			}
		}
		long c=0;
		for(int i=n-1;i>minb&&h>0;i--) {
			h-=b[i];
			c++;
		}
		if(h<=0)System.out.println(c);
		else System.out.println(c+(h+a[n-1]-1)/a[n-1]);

	}
}
