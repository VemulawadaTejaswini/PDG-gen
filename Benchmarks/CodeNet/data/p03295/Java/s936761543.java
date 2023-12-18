import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		int M  = sc.nextInt();
		Integer[] a = new Integer[M];
		for (int i=0; i<M; i++) {
			int a1 = sc.nextInt();
			int b1 = sc.nextInt();
			a[i] = b1*10 + a1;
		}
		Arrays.sort(a);
		int right = 0;
		int c = 0;
		for (int i=0; i<M; i++) {
			int t1 = a[i]/10; 
			int t2 = a[i]%10;
			
			if (t2 <= right && right <= t1 ) {
				
			}else {
				right = t1 -1;
				c++;
			}
		}
		System.out.println(c);
	}
}
