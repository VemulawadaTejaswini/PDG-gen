import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[N];
		int sum = 0;
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		Arrays.sort(a);

		if(sum < x) {
			System.out.println(N-1);
		}else if(sum == x) {
			System.out.println(N);
		}else {
			int asum = 0;
			for(int i=0;i<N;i++) {
				asum += a[i];
				if(asum > x) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}