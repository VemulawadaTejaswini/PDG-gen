

import java.util.Scanner;

public class Main {
	// inputs
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] R = new int[n];
		
		for(int i=0; i<n;i++) {
			R[i] = s.nextInt();
		}
		
		
	
		
		int max_profit = R[1]-R[0];
		int min = minimum(R[0],R[1]);
		
		for (int j=2;j<n;j++) {
			max_profit  = maximum(max_profit,R[j]-min);
			min = minimum(min,R[j]);
		}
		System.out.println(max_profit);
	}
	static int minimum(int a, int b) {
		if (a < b) return a;
		else return b;
	}
	static int maximum(int a, int b) {
		if(a > b) return a;
		else return b;
	}
	
	
}
