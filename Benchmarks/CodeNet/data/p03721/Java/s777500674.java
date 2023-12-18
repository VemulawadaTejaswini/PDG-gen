
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long K = scan.nextLong();
		long bSum = 0;
		int min = 1000000;
		int minIndex = 0;
		int[] a = new int[N];
		int[] b = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
		}
		while(true) {
			for(int i = 0; i < N; i++) {
				if(min > a[i]) {
					min = a[i];
					minIndex = i;
				}
			}
			bSum += b[minIndex];
			if(K <= bSum) {
				System.out.println(a[minIndex]);
				break;
			} else {
				a[minIndex] = 1000000;
				min = 1000000;
				minIndex = 0;
			}
		}
		scan.close();
	}

}
