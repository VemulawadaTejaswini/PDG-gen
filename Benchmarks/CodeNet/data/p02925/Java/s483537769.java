//ナイーブで間に合わなかったので、queueを使って、変化があった選手についてだけ翌日見ることにした。
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[][] = new int[N][N-1];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N-1;j++) {
				A[i][j]=sc.nextInt()-1;
			}
		}
		sc.close();
		int INF = Integer.MAX_VALUE/2;
		int cnt[] = new int[N]; //各選手の次の対戦相手を表すポインタがどこにあるか
		int p[] = new int[N]; //各選手の次の対戦相手
		for(int i=0;i<N;i++) {
			p[i] = A[i][0];
		}
		
		Queue<Integer> q = new ArrayDeque<>();
		Queue<Integer> q_check = new ArrayDeque<>();
		
		//日にち
		int day = 0;

		for(;day<1000000;day++) {
			if(day==0) {
				for(int j=0;j<N;j++) {
					if(p[p[j]]==j) {
						//マッチング成功
						q_check.offer(j);
					}
				}
			}
			else {
				while(!q.isEmpty()) {
					int now = q.poll();
					if(p[now]==-1)continue;
					if(p[p[now]]==now) {
						//マッチング成功 //二重で追加しないように、含んでいない場合だけ、追加する。
						if(!q_check.contains(now)) q_check.offer(now);
						if(!q_check.contains(p[now])) q_check.offer(p[now]);
					}
				}
			}

			boolean isStop = true;
			while(!q_check.isEmpty()) {
				int now = q_check.poll();
				cnt[now]++;
				if(cnt[now]!=N-1) p[now]=A[now][cnt[now]];
				else p[now]=-1;
				q.add(now);

				isStop = false;//一回でも入れば、進んでいる
				}

			if(isStop)break;
		}
		
		for(int i=0;i<N;i++) {
			if(cnt[i]!=N-1) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(day);
	}
}
