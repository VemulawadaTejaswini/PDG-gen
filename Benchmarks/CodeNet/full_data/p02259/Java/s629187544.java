import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] A = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}

		int count = 0;

		for(int i = 0; i < n; i++) {
			for(int j = n - 1; j >i;j--) {
				if(A[j]< A[j-1]) {
					int temp = A[j];
					A[j] = A[j-1];
					A[j-1]=temp;
					count++;
				}
			}
		}

		for(int i = 0; i < n; i++) {
			if(i==0) {
				System.out.print(A[i]);
			}
			else {
				System.out.print(" " + A[i]);
			}
		}
		System.out.println();
		System.out.println(count);

	}
}
