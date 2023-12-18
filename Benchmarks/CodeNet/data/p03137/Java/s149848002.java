import java.util.*;
 
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (n >= m) {
			System.out.println(0);
			return;
		}
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int[] ds = new int[m - 1];
		for (int i = 0; i < m - 1; i++) {
			ds[i] = arr[i + 1] - arr[i];
		}
		Arrays.sort(ds);
		int sum = 0;
		for (int i = 0; i < m - n; i++) {
			sum += ds[i];
		}
		System.out.println(sum);
	}
}