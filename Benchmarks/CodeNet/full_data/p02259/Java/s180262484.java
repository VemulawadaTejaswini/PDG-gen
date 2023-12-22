import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class pr_2_A_bubble_sort {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String tmp_arr[] = new String[n];
		int arr[] = new int[n];
		tmp_arr = br.readLine().split(" ");
		for(int i=0; i<n;i++){
			arr[i] = Integer.parseInt(tmp_arr[i]);
		}
		
		int ans = bubblesort_swap_num(arr);
		System.out.println(ans);
	}
	public static int bubblesort_swap_num(int[] arr){
		int n = arr.length;
		int ans = 0;
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if(arr[i] > arr[j]){
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					ans++;
				}
			}	
		}
		return ans;
	}	
}

