import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		long total = 0;
		int x = 2;
		for (int i = 0; i < n - 2; i++) {
		    for (int j = i + 1; j < n - 1; j++ ) {
		        for (int k = j + 1; k < n; k++) {
		            if (arr[i] < arr[j] + arr[k] && arr[j] < arr[k] + arr[i] && arr[k] < arr[i] + arr[j]) {
		                total++;
		            }
		        }
		    }
		}
		System.out.println(total);
	}
}
