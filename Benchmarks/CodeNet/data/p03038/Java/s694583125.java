import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[]=new int[N];
		for(int i=0;i<N;i++) A[i]=sc.nextInt();
		int D[][] = new int[M][2];
		for(int i=0;i<M;i++) {
			D[i][0]=sc.nextInt();//B
			D[i][1]=sc.nextInt();//C
		}
		sc.close();
		Queue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0;i<N;i++)pq.offer(A[i]);
		//reverse sort D by C
		Arrays.sort(D,(d1,d2)->d2[1]-d1[1]);
		
		boolean fin = false;
		for(int i=0;i<M;i++) {
			int tB = D[i][0];
			int tC = D[i][1];
			for(int j=0;j<tB;j++) {
				if(pq.peek()<tC) {
					pq.poll();
					pq.offer(tC);
				}else {
					fin = true;
					break;
				}
			}
			if(fin)break;
		}
		long ans = 0;
		while(!pq.isEmpty()) {
			ans += pq.poll();
		}
		System.out.println(ans);
	}
}