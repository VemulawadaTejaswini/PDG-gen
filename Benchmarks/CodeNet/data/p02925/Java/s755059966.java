import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int N = nextInt();

		List<List<Integer>> player = new ArrayList<List<Integer>>(N+1);
		Set<Integer> Pset = new HashSet<>(N); // 残り試合が存在するplayerを管理
		for(int i=0;i<=N;i++) {
			player.add(new ArrayList<Integer>(N-1));
		}
		for(int i=1;i<=N;i++) {
			Pset.add(i);
			List<Integer> p = player.get(i);
			for(int j=0;j<N-1;j++) {
				p.add(nextInt());
			}
			Collections.reverse(p);
		}

		List<Integer> RemoveL = new ArrayList<Integer>(N);;
		Iterator<Integer> iterator = RemoveL.iterator();;
		int []Listlen = new int[N+1]; // Listのsize
		int []yo_f = new int[N+1]; // 参照済みのflag
		int []op = new int[N+1]; // Opponent
		Arrays.fill(Listlen, N-1);
		Arrays.fill(op, -1);
		boolean flag = false; // trueならばその日、対戦成立
		boolean R_flag = false; // trueならば全対戦終えたplayerが現れた 削除待ち
		int Days = 0;

		for(int i=1;i<=N;i++) {
			op[i] = player.get(i).get(0); // 対戦候補を入れる
		}
		while(true) {
			for(int i : Pset) {
				yo_f[i] = 1; // 参照済み
				if(Listlen[i] <= 0)continue;    // Listのsize <= 0
				int Opponent = op[i];
				if(Opponent == -1 || yo_f[Opponent] == 1) continue; // 参照済み
				if(op[Opponent] == i) { // 対戦成立
					//out.println(i+ "   vs  "+ Opponent);

					op[Opponent] = -1; // 成立済み
					op[i] = -1;
					yo_f[Opponent] = 1; // 参照済み
					player.get(i).remove(0);
					player.get(Opponent).remove(0);
					Listlen[i]--;
					Listlen[Opponent]--;
					flag = true;

					if(Listlen[i]<=0) {
						RemoveL.add(i);
						R_flag = true;
					}else
					if(op[i] == -1) {
						op[i] = player.get(i).get(0); // 対戦候補を入れる
					}

					if(Listlen[Opponent]<=0) {
						RemoveL.add(Opponent);
						R_flag = true;
					}else
					if(op[Opponent] == -1) {
						op[Opponent] = player.get(Opponent).get(0); // 対戦候補を入れる
					}
				}
			}

			if(!flag) {
				for(int i=1;i<=N;i++) {
					if(Listlen[i]>0) {
						Days = -1;
						break;
					}
				}
				break;
			}
			flag = false;
			if(R_flag) {
				iterator = RemoveL.iterator();
				while (iterator.hasNext()) {
				    int i = iterator.next();
				    Pset.remove(i);
				}
				RemoveL.clear();
			}
			R_flag = false;

			Arrays.fill(yo_f, 0);
			Days++;
		}

		out.println(Days);
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}

}