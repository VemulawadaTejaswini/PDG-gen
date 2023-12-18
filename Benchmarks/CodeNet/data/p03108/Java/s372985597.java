import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int[][] bridge = new int[M][2];
		for(int i = 0;i < M;i++) {
			bridge[i][0] = scn.nextInt();
			bridge[i][1] = scn.nextInt();
		}

		ArrayList<Group> G = new ArrayList<Group>();

		long[] ans = new long[M];
		ans[M-1] = (long)N * (long)(N-1)/2;
		for(int i = M-1;i > 0;i--) {
			long buf = ans[i];
			if(buf == 0) {
				ans[i-1] = 0;
				continue;
			}

			int a = bridge[i][0];
			int b = bridge[i][1];

			int ga = -1, gb = -1;
			for(int j = 0;j < G.size();j++) {
				Group g = G.get(j);
				if(ga==-1) {
					if(g.exist(a))ga = j;
				}
				if(gb == -1) {
					if(g.exist(b))gb = j;
				}
				if(ga!=-1 && gb != -1)break;
			}

			if(ga == -1 && gb == -1) {
				buf -= 1;
				G.add((new Group().add(a).add(b)));
			}else {
				if(ga == -1) {
					Group gbuf = G.get(gb);
					buf -= gbuf.size();
					gbuf.add(a);
				}else {
					if(gb == -1) {
						Group gbuf = G.get(ga);
						buf -= gbuf.size();
						gbuf.add(b);
					}else {
						if(ga == gb) {

						}else {
							Group gbufa = G.get(ga);
							Group gbufb = G.get(gb);
							buf -= gbufa.size()*gbufb.size();
							if(Group.mix(gbufa, gbufb)) {
								G.remove(gb);
							}else {
								G.remove(ga);
							}
						}
					}
				}
			}
			if(buf < 0)buf = 0;
			ans[i-1] = buf;

		}
		for(int i = 0;i < M;i++) {
			System.out.println(ans[i]);
		}

	}

}

class Group{
	ArrayList<Integer> island = new ArrayList<Integer>();
	Group add(int a) {
		island.add(a);
		return this;
	}

	boolean exist(int a) {
		return island.indexOf(a) >= 0;
	}

	long size() {
		return island.size();
	}

	ArrayList<Integer> getIsl(){
		return island;
	}

	static boolean mix(Group a, Group b) {//b = true;
		if(a.size() > b.size()) {
			ArrayList<Integer> buf = b.getIsl();
			for(int i = 0;i < buf.size();i++) {
				a.add(buf.get(i));
			}
			return true;
		}else {
			ArrayList<Integer> buf = a.getIsl();
			for(int i = 0;i < buf.size();i++) {
				b.add(buf.get(i));
			}
			return false;
		}
	}
}
