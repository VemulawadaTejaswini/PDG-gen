import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (new InputStreamReader (System.in));
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Integer[] arr = new Integer[n];
		int sum = 0;
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		Arrays.sort (arr, Collections.reverseOrder());
		float limit = sum/(4*m);
		
		for (int i=0; i<n; i++) {
			if (m != 0 && arr[i] > limit) {
				m--;
			}
			else if (m == 0) {
				break;
			}
		}
		
		if (m == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
