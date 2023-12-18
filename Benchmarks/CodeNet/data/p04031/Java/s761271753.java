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
		int ans = 0;
		for(int i = 0 ; i < N ; i++) {
			ans += (avg - a[i]) * (avg - a[i]);
		}
		System.out.println(ans);
	}
}
