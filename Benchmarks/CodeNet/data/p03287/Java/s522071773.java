import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		long sumA = 0;
		long[] sumAs = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sumA += a[i];
			sumAs[i] = sumA;
		}


		int ans = 0;
		for(int i = 0; i < n; i++) {
			long div = 0;
			if(i != 0) div = sumAs[i - 1];
			for(int j = i; j < n; j++) {
				if((sumAs[j] - div) % m == 0){
					ans++;
				}
			}
		}

		System.out.println(ans);
	}
}