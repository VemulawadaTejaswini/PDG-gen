import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Pair{
		int L;
		int R;
		Pair(int L, int R){
			this.L=L;
			this.R=R;
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		ArrayList<Pair> lr = new ArrayList<>();
		for(int i=0; i<M; i++) {
			int L=sc.nextInt(); L--;
			int R=sc.nextInt(); R--;
			lr.add(new Pair(L, R));
		}

		int sum[] = new int[N+1];

		sum[0]=0;
		for(int i=0; i<M; i++) {
			Pair p = lr.get(i);
			sum[p.L] += -1;
			sum[p.R+1] += 1;
		}

		int cnt = 0;
		if(sum[N]==M) cnt++;
		for(int i=N-1; i>=0; i--) {
			sum[i] += sum[i+1];
			if(sum[i]==M) cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}
}
