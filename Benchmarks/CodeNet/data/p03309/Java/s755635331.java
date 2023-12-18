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
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Math.abs(arr[i] - (i + b + 1));
		}
		System.out.println(sum);
	}
}
