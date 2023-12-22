
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int n = sc.nextInt(), m = sc.nextInt();
			if ((n|m) == 0) break;
			
			UF uf = new UF(n);
			PriorityQueue<E> q = new PriorityQueue<E>();
			for (int i=0;i<m;i++) q.add(new E(sc.nextInt(), sc.nextInt(), sc.nextInt()));
			
			int c = 0;
			for (;! q.isEmpty();) {
				E cur = q.remove();
				if (uf.same(cur.f, cur.t)) continue;
				uf.unite(cur.f,  cur.t);
				c += cur.c;
			}
			
			System.out.println(c);
		}
	}
	
	class E implements Comparable<E> {
		int f, t, c;
		E(int f, int t, int c) {
			this.f = f;
			this.t = t;
			this.c = c;
		}
		
		@Override
		public int compareTo(E o) {
			// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
			return c - o.c;
		}
		
	}
	
	class UF {
		int[] par, rank;
		
		public UF(int n) {
			par = new int[n];
			rank = new int[n];
			for(int i=0;i<n;i++) par[i] = i;
		}
		
		//テ、ツサツ」ティツ。ツィテ・ツ?ε」ツつ津ヲツアツづ」ツつ?」ツつ?
		int find(int x) {
			if( par[x] == x ) return x;
			return par[x] = find(par[x]);
		}
		
		//ティツヲツ?ァツエツ?テ」ツ?ィyテ」ツつ津、ツスツオテ・ツ青暗」ツ?凖」ツつ?
		void unite(int x, int y) {
			x = find(x);
			y = find(y);
			if( x == y ) return;
			
			if( rank[x] < rank[y]  ) par[x] = y;
			else {
				par[y] = x;
				if( rank[x] == rank[y] ) rank[x]++;
			}
		}
		
		//テ・ツ青古、ツクツ?」ツ?ョテゥツ崢?・ツ青暗」ツ?ォテ・ツ青ォテ」ツ?セテ」ツつ古」ツつ凝」ツ?凝ィツェツソテ」ツ?ケテ」ツつ凝ッツシツ師rueテ」ツ?ェテ」ツつ悦テ」ツ?ィyテ」ツ?ッテ・ツ青古」ツ?佚ゥツ崢?・ツ青暗ッツシツ掲alseテ」ツ?ェテ」ツつ嘉ァツ閉ーテ」ツ?ェテ」ツつ?
		boolean same(int x, int y) {
			return find(x) == find(y);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}