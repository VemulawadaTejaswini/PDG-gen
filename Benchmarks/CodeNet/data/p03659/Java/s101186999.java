import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] a = new int[N];
		int sum = 0;
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}

		int min = Integer.MAX_VALUE;
		int sum_order = 0;
		for(int i=0;i<N-1;i++) {
			sum_order += a[i];
			sum -= a[i];
			int diff = Math.abs(sum_order - sum);

			if(min > diff) {
				min = diff;
			}
		}
		System.out.println(min);
	}

}
