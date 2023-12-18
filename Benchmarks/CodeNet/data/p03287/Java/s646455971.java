import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int A[] = new int[N];
		for(int i=0;i<N;i++) A[i]=sc.nextInt();
		sc.close();
		
		int sum[] = new int[N];
		sum[0]=A[0]%M;
		for(int i=1;i<N;i++) {
			sum[i] =  (sum[i-1] + A[i])% M;
		}
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<sum.length;i++) {
			if(map.containsKey(sum[i])) {
				int now = map.get(sum[i]); 
				map.put(sum[i],++now);
			}else {
				map.put(sum[i], 1);
			}
		}
		long ans = 0;
		//map は　keySetを利用して全操作する。
		for(int key:map.keySet()) {
			int value = map.get(key);
			int add = (value-1)*value/2;
			ans += add;
		}
		//0の時だけ自分自身だけでもカウント出来る。
		ans += map.get(0);
		System.out.println(ans);
	}
}
