
import java.util.Scanner;
public class Main {
	public static int INF = 10000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int min = INF;
		int max = -INF;
		long sum = 0;
		for(int i = 0;i<a.length;i++) {
			a[i] = sc.nextInt();
			if(min > a[i])  min = a[i];
			if(max < a[i]) max = a[i];
			sum += a[i];
		}
		System.out.println(min+" "+max+" "+sum);
	}
}

