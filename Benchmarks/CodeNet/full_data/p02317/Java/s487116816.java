import java.util.Arrays;
import java.util.Scanner;

public class Main {/* Longest Increasing Subsequence */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n], lis = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		
		lis[0] = 1;
		for(int i = 1; i < n; i++){
			int count = 1;
			int lastLIS = i;
			for(int j = i - 1; j >= 0; j--){
				if(a[j] < a[lastLIS]){/* a[i]???a[lastLIS]???????°??????? */
					count++;
					lastLIS = j;
				}
			}
			lis[i] = count;
		}
		Arrays.sort(lis);
		System.out.println(lis[n-1]);
	}
	
}