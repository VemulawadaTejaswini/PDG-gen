import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		boolean flag = true;
		int count = 0;
		while(flag) {
			flag = false;
			for(int j = n-1; j > 0; j--) {
				if(A[j]  < A[j-1]) {
					int temp = A[j];
					A[j] = A[j-1];
					A[j-1] = temp;
					flag = true;
					count++;
				}
			}
		}
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
		System.out.println(count);
	}
}

