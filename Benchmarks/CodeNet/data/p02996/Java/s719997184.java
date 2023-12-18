

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		long sum = 0;
		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			sum += arr[i][0];
		}
		Arrays.sort(arr, new Comparator<int[]>() { //double[]でコンパレーターを実装する
			  public int compare(int[] a, int[] b) {
			    if(a[1] > b[1]) {
			      return 1;
			    }else if (a[1] == b[1]) {
			      return 0;
			    }else {
			      return -1;
			  }}});
		String ans = "Yes";
		if(arr[n-1][1] < sum) {
			ans = "No";
		}else {
			int task = 0;
			for(int i = 0; i < n; i++) {
				task += arr[i][0];
				if(task > arr[i][1]) {
					ans = "No";
					break;
				}
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
	
}
