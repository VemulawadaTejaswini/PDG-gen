import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		int A[] = new int[N];
		for(int i=0;i<N;i++)A[i]=sc.nextInt();
		sc.close();
		
		int sum[] = new int[N+1];
		sum[0]=0;
		for(int i=0;i<N;i++)sum[i+1]=(int)((long)sum[i]+A[i])%K;
		
		int T[] = new int[N+1];
		for(int i=0;i<N+1;i++) {
			T[i]=(sum[i]-i)%K;
			if(T[i]<0)T[i]+=K; //負数をmodでプラスにするにはこの計算するしかない？
		}
		Map<Integer,Integer> map = new HashMap();
		long ans = 0;
		Queue<Integer> q = new ArrayDeque();
		for(int j=0;j<N+1;j++) {
			int cnt = 0;
			if(map.containsKey(T[j])) {
				cnt = map.get(T[j]);
				ans += cnt;
			}
			map.put(T[j],++cnt);
			q.offer(T[j]);
			while(q.size()>=K) {
				int rm = q.poll();
				map.put(rm,map.get(rm)-1);
			}
		}
		System.out.println(ans);
	}
}
