import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];
		for (int i=0;i<N;i++) {
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		Arrays.sort(a);
		for (int i=0;i<N;i++) {
			if (b[i]<a[N/2]) {
				System.out.println(a[N/2]);
			} else {
				System.out.println(a[N/2-1]);
			}
		}
	}
}