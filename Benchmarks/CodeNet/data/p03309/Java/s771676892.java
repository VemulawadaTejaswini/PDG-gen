import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			arr2[i] = arr[i] - (i + 1);
		}
		Arrays.sort(arr2);
		int b = arr2[n / 2];
		int c = arr2[n / 2 + 1];
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum1 += Math.abs(arr[i] - (i + b + 1));
			sum2 += Math.abs(arr[i] - (i + c + 1));
		}
		System.out.println(Math.min(sum1, sum2));
	}
}
