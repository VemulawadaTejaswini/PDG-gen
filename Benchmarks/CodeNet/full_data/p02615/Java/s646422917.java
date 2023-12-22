import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		long sum = 0;
		for (int i = arr.length-1; i > 0; i--) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}