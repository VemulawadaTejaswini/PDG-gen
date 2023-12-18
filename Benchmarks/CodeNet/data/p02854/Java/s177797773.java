import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		a[0] = sc.nextLong();
		for(int i = 1; i < n; i++) {
			a[i] = sc.nextLong()+a[i-1];
		}
		long ans = Long.MAX_VALUE;
		long dis = Long.MAX_VALUE;
		int num = 0;
		for(int i = 0; i < n; i++) {
			long temp = Math.abs(a[n-1]/2-a[i]);
			if(dis > temp) {
				dis = temp;
				num = i;
			}
		}
		if(a[n-1]%2==1) {
			ans = 1+Math.min(Math.abs((a[n-1]+1)/2-a[num]),Math.abs ((a[n-1]-1)/2-a[num]));
		}
		else {
			ans = Math.abs(dis);
		}
		System.out.println(ans);
	}
}
