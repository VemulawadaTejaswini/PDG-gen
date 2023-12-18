import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static long MIN = Long.MIN_VALUE;

	public static void main(String[] args){
		Scanner io = new Scanner(System.in);
		int N = io.nextInt();
		PriorityQueue<Integer> que1 = new PriorityQueue<Integer>();
		int[] center = new int[N];
		PriorityQueue<Integer> que2 = new PriorityQueue<Integer>();
		long sum1=0,sum2=0;
		
		int a;
		for (int i = 0; i < N; i++) {
			a = io.nextInt();
			sum1 += a;
			que1.offer(a);
		}
		for (int i = 0; i < N; i++) {
			a = io.nextInt();
			center[i] = a;
			que2.offer(a);
		}
		for (int i = 0; i < N; i++) {
			a = io.nextInt();
			que2.offer(a);
		}
		
		for (int i = 0; i < N; i++) {
			sum2 += que2.poll();
		}
		
		long now = sum1-sum2;
		long ans = now;
		
		
		for(int i=0;i<N;i++){
			if(que1.peek()<center[i]){
				now += center[i]-que1.poll();
				que1.offer(center[i]);
			}
			if(que2.peek()>center[i]){
				now -= que2.poll() - center[i];
			}else{
				que2.remove(center[i]);
			}
			ans = Math.max(ans, now);
		}
		System.out.println(ans);
	}
}

