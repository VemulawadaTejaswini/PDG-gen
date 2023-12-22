import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] ia;

		while (true) {
			ia = in.readLine().split(" ");
			int M = Integer.parseInt(ia[0]);
			int T = Integer.parseInt(ia[1]);
			int P = Integer.parseInt(ia[2]);
			int R = Integer.parseInt(ia[3]);
			if(M == 0 && T == 0 && P == 0 && R == 0){
				break;
			}
			ArrayList<team> al = new ArrayList<team>();
			for(int x = 1;x <= T; ++x){
				al.add(new team(x, P));
			}
			for(int x = 0;x < R; ++x){
				ia = in.readLine().split(" ");
				int m = Integer.parseInt(ia[0]);
				int t = Integer.parseInt(ia[1]);
				int p = Integer.parseInt(ia[2]);
				int j = Integer.parseInt(ia[3]);
				team tmp = al.get(t-1);
				if(j == 0){
					tmp.solved[p-1] = true;
					tmp.time[p-1] = m;
				} else {
					++tmp.submit[p-1];
				}
			}
			for(int x = 0;x < T; ++x){
				al.get(x).solve();
			}
			Collections.sort(al);
			for(int x = 0;x < T-1; ++x){
				System.out.print(al.get(x).teamnum);
				if(al.get(x).place(al.get(x+1))){
					System.out.print("=");
				} else {
					System.out.print(",");
				}
			} System.out.print(al.get(T-1).teamnum);
			System.out.println();
		}
	}

	static class team implements Comparable<team>{
		int teamnum;
		int problems;
		int point;
		boolean[] solved;
		int[] submit;
		int[] time;
		team(int x, int p){
			this.teamnum = x;
			this.problems = 0;
			this.point = 0;
			this.solved = new boolean[p];
			this.submit = new int[p];
			this.time   = new int[p];
		}
		void solve(){
			for(int i = 0;i < solved.length; ++i){
				if(solved[i]){
					++this.problems;
					this.point += time[i] + submit[i] * 20;
				}
			}
		}
		@Override
		public int compareTo(team o) {
			if(o.problems != this.problems){
				return o.problems - this.problems;
			} else if(o.point != this.point){
				return  -1 * (o.point - this.point);
			} else {
				return o.teamnum - this.teamnum;
			}
		}

		public boolean place(team o){
			if(o.problems != this.problems){
				return false;
			} else if(o.point != this.point){
				return false;
			} else {
				return true;
			}
		}
	}
}