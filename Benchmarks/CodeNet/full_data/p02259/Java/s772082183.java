import java.util.Scanner;

public class Main{
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[]A = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}
		scan.close();

		bubbleSort(A, n);
		disp(A, n);
		System.out.println(cnt);
	}
	static void bubbleSort(int[]A, int n) {
		boolean flag = true;
		while(flag) {
			flag = false;
			for(int i = n - 1; i >= 1; i--) {
				if(A[i] < A[i - 1]) {
					int t = A[i];
					A[i] = A[i - 1];
					A[i - 1] = t;
					flag = true;
					cnt ++;
				}
			}
		}
	}
	static void disp(int[]A, int n) {
		for(int i = 0; i < n; i++) {
			if(i == n - 1) {
				System.out.println(A[i]);
			}else {
				System.out.print(A[i] + " ");
			}
		}
	}
}
