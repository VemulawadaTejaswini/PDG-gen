import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long t = sc.nextLong();
		long[] a = new long[n];
		for(int i = 0 ; i  <n ; i++) a[i] = sc.nextLong();
		long now = 0;
		for(int i = 0 ; i < n ; i++) {
			if(a[i] <= now && now <= a[i] + t) now = a[i] + t;
			else now += t;
		}
		System.out.println(now);
	}
}