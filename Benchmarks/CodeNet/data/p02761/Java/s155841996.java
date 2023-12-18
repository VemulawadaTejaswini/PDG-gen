

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		if(n<1 || n >3 || m<0 || m>5) {
			return; 
		}
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		for(int i =0, j=0; i<n || j<m; i++, j++) {
			if(i<n) {
				int x = s.nextInt();
				if(x>=1 && x<=n) {
					arr1[i] = s.nextInt();
				}
			}
			if(j<m) {
				int x = s.nextInt();
				if(x>=0 && x<=m) {
					arr2[i] = s.nextInt();
				}
			}
		}
	    ArrayList<Integer> isProcessed = new ArrayList<>();
	    System.out.println(guess(arr1, arr2, isProcessed));

	}

	private static int guess(int[] arr1, int[] arr2, ArrayList<Integer> isProcessed) {
		int num = 0;
		for(int i =0; i < arr1.length && i < arr2.length; i++) {
			if(!isProcessed.contains(arr1[i])) {
			num = num + ((int)Math.pow(10, arr1.length - arr1[i]))*arr2[i];
			isProcessed.add(arr1[i]);
			}
		}
		return num;
	}

}
