import java.util.*;

public class Main {

	boolean[] can;
	int N, a, b;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			N = in.nextInt(); a = in.nextInt(); b = in.nextInt();
			if(N==0 && a==0 && b==0) return ;
			System.out.println(solve());
		}
	}

	int solve(){
		can = new boolean[N+1];
		can[0] = true;
		for(int i=0; i<=N; i++)if(can[i]){
			if(i+a<=N) can[i+a] = true;
			if(i+b<=N) can[i+b] = true;
		}
		int ret = 0;
		for(int i=0; i<=N; i++)if(!can[i]) ret++;
		return ret;
	}

	public static void main(String args[]){
		new Main().run();
	}
}