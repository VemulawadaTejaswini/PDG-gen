import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		ArrayList<ArrayList<Integer>> connect = new ArrayList<>(M);
		for(int i=0; i<M; i++){
			ArrayList<Integer> switches = new ArrayList<>();
			int k = in.nextInt();
			for(int j=0; j<k; j++) {
				switches.add(in.nextInt());
			}
			connect.add(switches);
		}
		int[] condition = new int[M];
		for(int i=0; i<M; i++) {
			condition[i] = in.nextInt();
		}
		
		int count = 0;
		AllPat : for(int pat=0; pat<(1<<N); pat++) {
			for(int l =0; l<M; l++) {
				int on = 0;
				for(Integer s : connect.get(l)) {
					if(((1<<(s-1)) & pat) != 0) on++;
				}
				if(on%2 != condition[l]) continue AllPat;
			}
			count ++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
