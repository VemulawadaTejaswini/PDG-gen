import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		if (N >= M) {
			System.out.println(0);
			return;
		}
		
		int[] map = new int[M];
		for (int i = 0; i < M; i++) {
			map[i] = sc.nextInt();
		}
		
		Arrays.sort(map);
		
		int sum = 0;
		LinkedList<X> list = new LinkedList<X>();
		for (int i = 0; i < M-1; i++) {
			X x = new X(i, map[i+1]-map[i]);
			list.add(x);
			sum += x.cost;
		}
		
		Collections.sort(list);
		for (int i = 0; i < N-1; i++) {
			X x = list.removeFirst();
			sum -= x.cost;
		}
		
		System.out.println(sum);
		
		
	}
	
	static class X implements Comparable<X>{
		int index;
		int cost;
		
		public X(int index, int cost) {
			this.index = index;
			this.cost = cost;
		}

		@Override
		public int compareTo(X o) {
			return o.cost - this.cost;
		}
	}
}