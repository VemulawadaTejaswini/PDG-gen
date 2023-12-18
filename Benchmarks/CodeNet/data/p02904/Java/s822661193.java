import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] p = new int[n];
		for(int i=0;i<n-1;i++) 	p[i] = sc.nextInt();
		sc.close();

		int[] mins = new int[n];
		int[] maxs = new int[n];
		PriorityQueue<Integer> pqmax = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> pq = new PriorityQueue<> ();
		int[] mappu = new int[n];

		for(int i=0; i<n; i++) {
			mappu[p[i]]=i;
		}

		for(int j=0; j<k; j++) {
			pqmax.add(p[j]);
			pq.add(p[j]);
		}
		mins[0]=mappu[pq.peek()];
		maxs[0]=mappu[pqmax.peek()];

		for(int i=1; i<n-k; i++) {
			int j=i+k-1;
			pq.add(p[j]);
			pqmax.add(p[j]);
			if(pq.peek()==p[i-1]) {
				pq.poll();
			}
			if(pqmax.peek()==p[i-1]) {
				pq.poll();
			}
			mins[i] = mappu[pq.peek()];
			maxs[i] = mappu[pqmax.peek()];
		}

		int ans = 1;
		for(int i=1; i<n-k; i++) {
			int j=i+k-1;
//			System.out.println(i+" m:"+mins[i]+" M:"+maxs[i]);
			if((i == mappu[mins[i]])&&(j == mappu[maxs[i]])) {
			}else {
				ans++;
			}
		}

		System.out.println(ans);

	}
}
