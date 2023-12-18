import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, k, h[];
		n = sc.nextInt();
		k = sc.nextInt();
		h = new int[n];

		for (int i = 0; i < n; ++i)
			h[i] = sc.nextInt();
		sc.close();

		Arrays.sort(h);

		int min = h[n - 1]; 

		for(int i = 0; i < n - k + 1; ++i) {
			int tmp = h[n - i - 1] - h[n - i - k];
			min = Math.min(min,  tmp);
		}
		
		System.out.println(min);
	}

}
