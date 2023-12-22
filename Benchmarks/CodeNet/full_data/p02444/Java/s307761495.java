import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		int n = src.nextInt();

		//配列arrayとコピー
		int[] array = new int[n];
		int[] copy = new int[n];
		
		for (int i=0; i<n; i++)
			array[i] = copy[i] = src.nextInt();

		int q = src.nextInt();

		for(int i=0; i<q; i++) {

			int b = src.nextInt();
			int m = src.nextInt();
			int e = src.nextInt();

			for(int k=0; k<(e - b); k++) {
				
				 copy[b + ((k + (e - m)) % (e - b))] = array[b+k];
//					System.out.print(array[k] + "debug");
			}
			for(int j=0; j<n; j++) {
				array[j] = copy[j];
			}

		}
		for(int i=0; i<n-1; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(array[n-1]);
	}
}
