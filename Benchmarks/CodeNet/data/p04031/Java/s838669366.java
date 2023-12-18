import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a  = new int[N];
		int total = 0;
		int avg = 0;
		for(int i = 0 ; i < N ; i++) {
			a[i] = sc.nextInt();
			total += a[i];
		}
		if(total % N == 0) {
			avg = total / N;
		} else {
			avg =  ((total + N) / N);
		}
		double ans = 0;
		for(int i = 0 ; i < N ; i++) {
			ans += Math.pow(Math.abs(a[i] - avg), 2);
		}
		System.out.println(ans);
	}
}
