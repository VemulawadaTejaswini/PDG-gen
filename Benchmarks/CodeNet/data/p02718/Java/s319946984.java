import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int sum = 0;
		Integer array[] = new Integer[n];
		String ans = "Yes";
		
		for(int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
			sum = sum + array[i];
		}
		
		Arrays.sort(array, Collections.reverseOrder());
		int ng = sum / (m * 4);
		for(int i = 0; i < m; i++) {
			if(array[i] < ng) {
				ans = "No";
				break;
			}
		}
				
		System.out.println(ans);
	}
}