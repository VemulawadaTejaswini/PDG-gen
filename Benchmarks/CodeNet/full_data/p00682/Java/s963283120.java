import java.util.*;
import java.io.*;
import java.math.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int[] x = new int[n];
			int[] y = new int[n];
			for(int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			double sum = 0;
			for(int i = 0; i < n; i++) {
				if(i == n-1) {
					sum += (x[i] - x[0])*(y[i] + y[0]);
				}
				else {
					sum += (x[i] - x[i+1])*(y[i] + y[i+1]);
				}
			}
			sum /= 2.0;
			sum = Math.abs(sum);
			
			System.out.println((count++) + " " + sum);
			
		}
	}
}