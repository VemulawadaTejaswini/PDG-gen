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
		//PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> pq = new PriorityQueue<> ();

		for(int j=0; j<k; j++) {
			maxs[0] = Math.max(maxs[0], p[j]);
			pq.add(p[j]);
		}
		mins[0]=pq.peek();

		for(int i=1; i<n-k; i++) {
			int j=i+k-1;
			pq.add(p[j]);
			if(pq.peek()==p[i-1]) {
				pq.poll();
			}
			mins[i] = pq.peek();
			maxs[i] = Math.max(maxs[i-1], p[j]);
		}

		int ans = 1;
		int tmpm=mins[0];
		int tmpM=maxs[0];
		for(int i=1; i<n-k; i++) {
			if((tmpm == mins[i])&&(tmpM == maxs[i])) {
			}else {
				ans++;
			}
			tmpm = mins[i];
			tmpM = maxs[i];
		}

		System.out.println(ans);

	}
}
