import java.util.Scanner;

public class Main {
	public static long count;
	public static int m;
	public static long[] a;
	public static int[] b;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		m = sc.nextInt();
		
		
		a = new long[n];
		b = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextInt();
		}
		
		count = 0;
		long money = 0L;
		
		while (count < m) {
			long min = Long.MAX_VALUE;
			int index = 0;
			
			for (int i = 0; i < a.length; i++) {
				if(b[i] > 0 && min > a[i]) {
					min = a[i];
					index = i;
				}
			}
			
			money += min;
			--b[index];
			++count;
		}
		
		System.out.println(money);
	}
}
