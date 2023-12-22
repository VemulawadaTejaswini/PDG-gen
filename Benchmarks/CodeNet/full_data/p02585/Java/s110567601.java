import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static long solve(List<Long> scores, int K){
		long S = 0;
		for(long s : scores){
			S += s;
		}
		long ret = 0;
		if(S >= 0){
			int step = K / scores.size();
			if(step >= 2){
				ret = S * (step - 2);
				K -= (step - 2) * scores.size();
			}
		}else{
			K = Math.min(K, scores.size());
		}
//		System.out.println(ret+" "+K);
		long ret2 = S >= 0 ? 0 : Long.MIN_VALUE;
		for(int i = 0 ; i < scores.size() ; ++i){
			long sum = 0;
			for(int j = 0; j < K ; ++j){
				int ind = (i + j) % scores.size();
				long s = scores.get(ind);
				sum += s;
				ret2 = Math.max(ret2, sum);
			}
		}
		// 31455326818
//		System.out.println(ret+" "+ret2+" "+(ret + ret2 - 29507023469L));
		return ret + ret2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int P[] = new int[N];
		long C[] = new long[N];
		for(int i = 0 ; i < N ; ++i){
			P[i] = sc.nextInt() - 1;
		}
		for(int i = 0 ; i < N ; ++i){
			C[i] = sc.nextLong();
		}
		boolean vis[] = new boolean[N];
		long ret = Long.MIN_VALUE;
		for(int i = 0 ; i < N ; ++i){
			if(vis[i]){
				continue;
			}
			List<Long> scores = new ArrayList<Long>();
			int cur = i;
			scores.add(C[cur]);
			vis[cur] = true;
			cur = P[cur];
			while(!vis[cur]){
				scores.add(C[cur]);
				vis[cur] = true;
				cur = P[cur];
			}
			ret = Math.max(ret, solve(scores, K));
		}
		System.out.println(ret);
	}
}
