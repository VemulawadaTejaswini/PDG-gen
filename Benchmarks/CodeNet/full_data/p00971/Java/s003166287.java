import java.util.*;

public class Main {
	// tuple definition
	public static class Tuple {
		int pi;
		int qi;
		char c;
		Tuple(int pi, int qi, char c) {
			this.pi = pi;
			this.qi = qi;
			this.c = c;
		}
	}
	
	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		String p = sc.nextLine();
		String q = sc.nextLine();

		// prefix
		p = "$" + p;
		q = "$" + q;
		
		int pn = p.length(), qn = q.length();
		// pnxt[i][j] := pにおいて位置 i に居て次に j(0/1) が現れるindex
		int[][] pnxt = new int[4010][2];
		pnxt[pn][0] = pnxt[pn][1] = pn;
		int plas0 = pn, plas1 = pn;
		for(int i = pn - 1; i >= 0; --i) {
			pnxt[i][0] = plas0;
			pnxt[i][1] = plas1;
			if(p.charAt(i) == '0') plas0 = i;
			if(p.charAt(i) == '1') plas1 = i;
		}
		// qnxt[i][j] := pnxt同様
		int[][] qnxt = new int[4010][2];
		qnxt[qn][0] = qnxt[qn][1] = qn;
		int qlas0 = qn, qlas1 = qn;
		for(int i = qn - 1; i >= 0; --i) {
			qnxt[i][0] = qlas0;
			qnxt[i][1] = qlas1;
			if(q.charAt(i) == '0') qlas0 = i;
			if(q.charAt(i) == '1') qlas1 = i;
		}

		// queue definition
		Queue<Tuple> que = new ArrayDeque<>();
		boolean[][] visited = new boolean[4010][4010];
		// restore definition
		Tuple[][] res = new Tuple[4010][4010];

		String ans = "";
		// BFS
		que.add(new Tuple(0, 0, '$'));
		visited[0][0] = true;
		res[0][0] = new Tuple(-1, -1, '$');
		while(!que.isEmpty()) {
			Tuple e = que.remove();
			int pi = e.pi, qi = e.qi;
			char c = e.c;
			if(pi == pn && qi == qn) {
				ans = ans + c;
				break;
			}
			int npi0 = pnxt[pi][0], nqi0 = qnxt[qi][0];
			if(!visited[npi0][nqi0]) {
				visited[npi0][nqi0] = true;
				res[npi0][nqi0] = new Tuple(pi, qi, c);
				que.add(new Tuple(npi0, nqi0, '0'));
			}
			int npi1 = pnxt[pi][1], nqi1 = qnxt[qi][1];
			if(!visited[npi1][nqi1]) {
				visited[npi1][nqi1] = true;
				res[npi1][nqi1] = new Tuple(pi, qi, c);
				que.add(new Tuple(npi1, nqi1, '1'));
			}
		}

		int pi = pn, qi = qn;
		// restore
		while(true) {
			Tuple e = res[pi][qi];
			if(e.c == '$') {
				System.out.println(ans);
				return;
			}
			ans = e.c + ans;
			pi = e.pi;
			qi = e.qi;
		}
	}
}
