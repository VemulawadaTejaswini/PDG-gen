import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N, sumA, sumB;
		sumA = 0; sumB = 0;
		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		int[] a = new int[N];
		
		for(int i=0; i < N; i++) {
			a[i] = input.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			for(int t = 0; t < N; t++) {
				if(a[i]>a[t]) {
					int temp = a[i];
					a[i] = a[t];
					a[t] = temp;
				}
			}
		}
		
		for(int i = 0; i < N; i+=2) {
			sumA += a[i];
		}
		for(int i = 1; i < N; i+=2) {
			sumB += a[i];
		}
		
		System.out.println(sumA - sumB);
		
	}

}
