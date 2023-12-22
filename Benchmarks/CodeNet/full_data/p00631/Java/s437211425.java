import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < 1 << n; i++) {
				int A = 0;
				int B = 0;
				for(int j = 0; j < n; j++) {
					if((i & 1 << j) != 0) {
						A += a[j];
					}
					else {
						B += a[j];
					}
				}
				min = Math.min(min, Math.abs(A - B));
			}
			System.out.println(min);
			
		}
	}
}