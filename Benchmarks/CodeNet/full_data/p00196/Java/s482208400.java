import java.util.*;
/* 19:08 ~ &#160;*/
public class Main {
	static class Team{
		String name;
		int win , lose , other;
		public Team(String n , int[] result) {
			this.name = n;
			this.win = result[0];
			this.lose = result[1];
			this.other = result[2];
		}
	}
	static void sort( ArrayList<Team> list , int left , int right) {
		ArrayList<Team> copy = new ArrayList<Team>();




&#160; &#160; &#160; &#160; if (left <= right) {
&#160; &#160; &#160; &#160; &#160; &#160; Team p = list.get((left+right)/2);
&#160; &#160; &#160; &#160; &#160; &#160; int l = left;
&#160; &#160; &#160; &#160; &#160; &#160; int r = right;
&#160; &#160; &#160; &#160; &#160; &#160;&#160;
&#160; &#160; &#160; &#160; &#160; &#160; while(l <= r) {
&#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; while(list.get(l).win < p.win){ l++; }
&#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; while(list.get(r).win > p.win){ r--; }
&#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; if (l <= r) {
&#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; Team tmp = list.get(l);
&#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; list.set(l,list.get(r));
&#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; list.set(r,tmp);
&#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; l++;&#160;
&#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; r--;
&#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; }
&#160; &#160; &#160; &#160; &#160; &#160; }
&#160; &#160;&#160;
&#160; &#160; &#160; &#160; &#160; &#160; sort(list, left, r);
&#160; &#160; &#160; &#160; &#160; &#160; sort(list, l, right);
&#160; &#160; &#160; &#160; }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(!sc.hasNext("0")) {
			ArrayList<Team> list = new ArrayList<Team>();
			int n = sc.nextInt();
			for ( int i = 0; i < n; i++ ) {
				String name = sc.next();
				int[] result = new int[3];
				for ( int j = 0; j < n - 1; j++ )
					result[sc.nextInt()]++;
				Team t = new Team(name,result);
				list.add(t);
			}
			sort(list,0,list.size()-1);
			Collections.reverse(list);
			for ( int i = 0; i < list.size(); i++ )
				System.out.println(list.get(i).name);
		}
	}
}