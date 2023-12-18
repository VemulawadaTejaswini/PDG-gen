import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[] arr = new int[N];
		int[] ans = new int[N];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			arr[i] = reader.nextInt();
		}
		for (int i = 0; i < N/2*2; i+=2) {
			ans[N/2+i/2] = arr[i];
			ans[N/2-(i/2+1)] = arr[i+1];
		}
		if (N%2==1) {
			ans[N-1] = arr[N-1];
			for (int i = N-1; i >= 0; i--) {
				System.out.print(ans[i] + " ");
			}
		} else {
			for (int i = 0; i < N; i++) {
				System.out.print(ans[i] + " ");
			}
		}


		reader.close();
	}


}



