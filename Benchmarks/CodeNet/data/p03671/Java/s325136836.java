import java.util.Scanner;

public class Main {
	
	static void BubbleSort(int d[]) {
		for (int i = d.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (d[j] > d[j + 1]) {
					int work;
					work = d[j];
					d[j] = d[j + 1];
					d[j + 1] = work;
				}
				// printData(d);
			}
		}
	}
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int A[] = new int[3];
		for (int i = 0; i < 3; i++) {
			A[i] = scan.nextInt();
		}

		BubbleSort(A);

		int ans = A[0]+A[1];
		
		System.out.println(ans);
		
		
	}
}