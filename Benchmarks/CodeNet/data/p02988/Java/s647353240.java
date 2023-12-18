import java.util.Scanner;


import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;



public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] p = new int[n];
		for(int i = 0; i<n ;i++) {
			p[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i<n-2 ;i++) {
			if(p[i] < p[i+1] && p[i+1]<p[i+2]) {
				sum++;
			}
			else if(p[i] > p[i+1] && p[i+1] > p[i+2]) {
				sum++;
			}
		}
		System.out.println(sum);

		
	}
}
