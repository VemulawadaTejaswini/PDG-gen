import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 0;
		
		int[] A = {9, 6, 1};
		
		while (N > 0) {
			int[] a = {0, 0};
			
			for (int i = 0; i < 2; ++i) {
				int x = calc(N, A[i]);
				if (x > 0) {
					a[i] = (int) Math.pow(A[i], x);
				}
			}
			
			if (a[0] == 0 && a[1] == 0) {
				count += N;
				break;
			} else {
				N -= Math.max(a[0], a[1]);
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	private static int calc(int n, int a) {
		if (a == 1) {
			return 1;
		}
		int i = 1;
		while (true) {
			if (n < Math.pow(a, i)) {
				return i - 1; 
			} else {
				i++;
			}
		}
	}
}