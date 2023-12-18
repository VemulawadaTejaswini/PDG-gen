import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0;i < N;i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int sum = 0;
		int n = 0;
		Arrays.sort(a);
		if((a[0]%2==0&&a[N-1]%2==0)
				||(a[0]%2!=0&&a[N-1]%2!=0)) {
			n = (a[0]+a[N-1])/2;
		}else {
			n = a[N/2];
		}
		for(int i = 0;i < N;i++) {
			sum += Math.pow(a[i]-n, 2);
		}
		System.out.println(sum);
	}
}