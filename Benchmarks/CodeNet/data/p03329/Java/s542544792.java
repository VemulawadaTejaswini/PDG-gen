import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 0;
		
		int[] A = {9, 6, 1};
		
		for (int i = 0; i < 3; ++i) {
			while (N > 0) {
				int x = calc(N, A[i]);
				if (x > 0) {
					count++;
					N -= Math.pow(A[i], x);
				} else {
					break;
				}
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
			if (n < a * i) {
				return i - 1; 
			} else {
				i++;
			}
		}
	}
}