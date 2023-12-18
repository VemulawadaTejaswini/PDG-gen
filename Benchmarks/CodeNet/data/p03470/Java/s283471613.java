import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] ds = new int[N];

		for(int i=0; i<N; i++) {
			ds[i] = sc.nextInt();
		}Arrays.sort(ds);

		int kasane = 0;
		int top = 0;
		for(int j=0; j<N; j++) {
			if(top < ds[j]) {
				kasane += 1;
				top = ds[j];
			}
		}
		System.out.println(kasane);

	}

}
