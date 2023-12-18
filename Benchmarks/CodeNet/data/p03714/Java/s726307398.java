import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * https://abc062.contest.atcoder.jp/tasks/arc074_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] a = new int[3*N];
		for(int i=0; i<N*3; i++){
			a[i] = Integer.parseInt(sc.next());
		}
		sc.close();
	
		long[] dpLeft = new long[N+1];
		long[] dpRight = new long[N+1];
		
		PriorityQueue<Integer> que = new PriorityQueue<>();
		long sum = 0;
		for(int i=0; i<N; i++){
			que.add(a[i]);
			sum += a[i];
		}	
		dpLeft[0] = sum;
		for(int i=1; i<=N; i++){
			que.add(a[i+N-1]);
			sum = sum + a[i+N-1] - que.remove();
			dpLeft[i] = sum;
		}
		
		//System.out.println(Arrays.toString(dpLeft));
		
		que = new PriorityQueue<>((o1,o2)->o2-o1);
		sum = 0;
		for(int i=3*N-1; i>=N*2; i--){
			que.add(a[i]);
			sum += a[i];
		}
		dpRight[0] = sum;
		for(int i=1; i<=N; i++){
			que.add(a[2*N-i]);
			sum = sum + a[2*N-i] - que.remove();
			dpRight[i] = sum;
		}
		//System.out.println(Arrays.toString(dpRight));
		
		long ans = Long.MIN_VALUE;
		for(int i=0; i<=N; i++){
			ans = Math.max(ans, dpLeft[i]-dpRight[N-i]);
		}
		
		System.out.println(ans);
		
	}
	

}