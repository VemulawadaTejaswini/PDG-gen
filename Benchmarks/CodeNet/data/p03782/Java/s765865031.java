package main;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;



public class Main {
	
	private static int[] arr;
	private int[][] ar2;
	private List<Integer> list;
	public static int n,m,k;
	private HashSet<Integer> set;
	private HashMap<Integer, Integer> map;
	//private Scanner sc;

//	

	public static void main(String[] args){
		
		//new Main().setVisible(true);]
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k =sc.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++)arr[i] = sc.nextInt();
		Arrays.sort(arr);
		List<HashSet<Integer>> ll = new ArrayList<HashSet<Integer>>();
		int[] sumArr = new int[n];
		
		for(int i=0; i<n; i++){
			if(i==0)sumArr[i] = arr[i];
			else {
				sumArr[i] = arr[i]+sumArr[i-1];
			}
		}
		
		int ans =0;
		int sum = sumArr[n-1];
		if(sum<k){
			System.out.println(n);
			return;
		}
		for(int i=n-1; i>=0; i--){
			int cur =i==0? sumArr[i]:sum-sumArr[i-1];
			if(cur>=k){
				ans = i;
				break;
			}
		}
		
		
		
		
		
		System.err.println(ans);
	}




}
