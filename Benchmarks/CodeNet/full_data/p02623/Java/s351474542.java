import java.util.Scanner;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		long[] a = new long[n];
		long[] b = new long[m];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		
		long sum = 0;
		int count = 0;
		int h = 0;
		int g = 0;
		
		do {
			if(a[h] >= b[g]) {
				sum += b[g];
				g += 1;
			}
			else {
				sum += a[h];
				h += 1;
			}
			
			count += 1;
		}while(sum < k);
		
		System.out.println(count - 1);
	}
}