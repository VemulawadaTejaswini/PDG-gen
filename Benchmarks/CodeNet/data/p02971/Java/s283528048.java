import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int []a = new int[n];
		int []b = new int[n];
		int high = 0;

		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
			b[i] = a[i];
			high = Math.max(high, a[i]);
		}
		Arrays.sort(b);

		for(int i = 0; i < n; i++) {
			if(a[i]!= high) {
				System.out.println(high);
			}else {
				System.out.println(b[n-2]);
			}
		}













	/*	for(int i = 0; i < max.length; i++) {
			max[i] = Integer.MIN_VALUE;
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j==i) {
					continue;
				}else {
					max[i] = Math.max(max[i], a[j]);
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println(max[i]);
		}*/

	}

}
