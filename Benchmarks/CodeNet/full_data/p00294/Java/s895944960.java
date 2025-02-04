import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
	static boolean[] isDist;
	static int N;
	static int M;
	public static int INF = 1 << 24;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		N = stdIn.nextInt();
		M = stdIn.nextInt();
		int p = stdIn.nextInt();
		isDist = new boolean[N];
		for(int i = 0; i < M ;i++) {
			int d = stdIn.nextInt();
			isDist[d] = true;
		}
		boolean[] isDist2 = new boolean[N];
		for(int i = 0; i < N; i++) {
			isDist2[i] = isDist[i]; 
		}
		solv(1,p,0,0,false,isDist);
		solv(-1,p,0,0,false,isDist2);
		System.out.println(queue.poll()-100);
		
		
	}
	static PriorityQueue<Integer> queue = new PriorityQueue(); 
	public static void solv(int vec, int nowp, int count, int cost, boolean alC,boolean[] isDist) {
		while(true) {
			if(count == M) {
				queue.add(cost);
				break;
			}
			if(nowp == N) {
				nowp = 0;
			}
			if(nowp == -1) {
				nowp = N-1;
			}
			if(isDist[nowp]) {
				
				isDist[nowp] = false;
				count++;
				if(!alC) {
					boolean[] isDist2 = new boolean[N];
					for(int i = 0; i < N; i++) {
						
						isDist2[i] = isDist[i];
					}
					solv(vec*-1,nowp+vec*-1,count,cost+100,true,isDist2);
				}
			}
			nowp += vec;
			cost += 100;
		}
	}
}

  