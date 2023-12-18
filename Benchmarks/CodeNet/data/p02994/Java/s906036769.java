import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int l = scan.nextInt();

		long sum = 0;
		long[] a = new long[n + 1];
		int i;
		for(i = 1; i <= n; i++) {
			long temp = (l + i - 1);
			sum += temp;
			a[i] = temp;
		}
		long min = Long.MAX_VALUE;
		for(i = 1; i <= n; i++) {
			min = Math.min(min, Math.abs(a[i]));
		}

		System.out.println(sum - min);
	}
}
