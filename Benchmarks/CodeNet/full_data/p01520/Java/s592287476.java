import java.util.*;
import java.io.*;
import java.math.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int e = sc.nextInt();
		int[] x = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			int check = x[i] * ((t+e)/ x[i]);
			if(check <= t+e && check >= t-e) {
				System.out.println((i+1));
				return;
			}
		}
		System.out.println(-1);
		
	}
}