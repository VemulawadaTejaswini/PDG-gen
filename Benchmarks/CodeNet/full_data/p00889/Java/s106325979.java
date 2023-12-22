import java.util.*;

public class Main {

	int N, Q;
	int[] as;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			int S, W;
			N = in.nextInt();
			S = in.nextInt();
			W = in.nextInt();
			Q = in.nextInt();
			if(N==0) return ;
			as = new int[N];
			int g = S;
			for(int i=0; i<N; i++){
				as[i] = (g/7)%10;
				if(g%2 == 0){
					g = g/2;
				}
				else{
					g = (g/2) ^ W;
				}
			}
			System.out.println(solve());
		}
	}

	int subsolve(){
		int ans = 0;
		boolean[] oks = new boolean[10];
		if(Q==2){
			oks[0] = oks[2] = oks[4] = oks[6] = oks[8] = true;
		}
		else{
			oks[0] = oks[5] = true;
		}
		int accum = 0;
		for(int i=0; i<N; i++){
			if(as[i] > 0){
				accum++;
			}
			if(oks[as[i]]){
				ans += accum;
			}
		}
		return ans;
	}

	int solve(){
		if(Q==2 || Q==5){
			return subsolve();
		}
		int ans = 0;
		int[] accums = new int[N];
		int ten = 10 % Q;
		accums[N-1] = as[N-1]%Q;
		for(int i=N-2; i>=0; i--){
			accums[i] = (ten * as[i] + accums[i+1])%Q;
			ten = (ten * 10)%Q;
		}
		HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
		dict.put(0, 1);
		for(int i=N-1; i>=0; i--){
			int sub = accums[i];
			sub = (sub + Q)%Q;
			if(as[i] > 0 && dict.containsKey(sub)){
				ans += dict.get(sub);
			}
			int cur = dict.containsKey(sub)?dict.get(sub):0;
			dict.put(sub, cur+1);
		}
		return ans;
	}

	public static void main(String args[]){
		new Main().run();
	}
}