import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int total = 0;
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		    total += arr[i];
		}
		Arrays.sort(arr);
		if (total % 10 != 0) {
		    System.out.println(total);
		    return;
		}
		for (int i = 0; i < n; i++) {
		    if (arr[i] % 10 != 0) {
		        System.out.println(total - arr[i]);
		        return;
		    }
		}
		System.out.println(0);
	}
}
