import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 0;
		
		int[] A = {9, 6, 1};
		
		int i = 0;
		while (N > 0) {
			if (i == 2) {
				count -= N;
				break;
			}
			int x = calc(N, A[i]);
			if (x > 0) {
				N -= Math.pow(A[i], x);
				count++;
			} else {
				i++;
			}
		}
		
		System.out.println(count);
	}
	
	private static int calc(int n, int a) {
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