import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long sum = 1;
		long[] x=new long[n];
		for(int i=0;i<n;i++) {
			x[i] = sc.nextLong();
		}
		for(int i=n-1;i>0;i--) {
			if(x[i]<=x[i-1]) {
				sum++;
			}
		}
		System.out.print(sum);
	}
}
