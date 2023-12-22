import java.util.*;
import java.io.*;
import java.math.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int[] list = new int[n];
			for(int j = 0; j < n ;j++) {
				list[j] = sc.nextInt();
			}
			int sum = 0;
			Comparator<Integer> comp = Collections.reverseOrder();
			PriorityQueue<Integer> queue = new PriorityQueue<Integer>(comp);
			for(int j = 1; j < n; j++) {
				int tmp = list[j] - list[j-1];
				sum += tmp;
				queue.add(tmp);
			}
			k = Math.min(k, queue.size()+1);
			for(int j = 1; j < k; j++) {
				sum -= queue.poll();
			}
			
			System.out.println(sum);

		}
		
		
	}
}