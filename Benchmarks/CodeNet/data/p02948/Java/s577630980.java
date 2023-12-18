
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		List <Integer>[]  L = new ArrayList [m];
		
		for(int i = 0 ;i < m ;i++) {
			L[i] = new ArrayList <Integer>();
		}
		
		for(int i = 0; i < n ;i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			if(m - a >= 0) {
				L[m-a].add(b);
			}
		}
		int ans = 0;
		PriorityQueue <Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		for(int day = m-1 ; day >= 0 ; day--) {
			for(int num : L[day]) {
				pq.add(num);
			}
			if(!pq.isEmpty()) {
				ans += pq.poll();
			}
		}
		
		System.out.println(ans);
	}
}

