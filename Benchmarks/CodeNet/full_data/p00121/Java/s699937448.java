
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	int[][] next = {{1,4},
					{0,2,5},
					{1,3,6},
					{2,7},
					{0,5},
					{1,4,6},
					{2,5,7},
					{3,6}};
	void run() {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int[] q = new int[8];
			for(int i=0;i<8;i++) {
				q[i] = sc.nextInt();
			}
			System.out.println(dfs(q));
		}
	}
	
	int dfs(int[] s) {
		LinkedList<String> visited = new LinkedList<String>();
		Struct now = new Struct(s, 0);
		LinkedList<Struct> que = new LinkedList<Struct>();
		que.add(now);
		visited.add(toString(s));
		for(;!que.isEmpty();) {
			now = que.removeFirst();
//			System.out.println(toString(now.s));
			if(toString(now.s).equals("01234567")) break;
			int a[] = now.s.clone();
			int zero = 0;
			for(int i=0;i<8;i++) if(a[i] == 0) {
				zero = i; break;
			}
			for(int i=0;i<next[zero].length;i++) {
				int[] b = a.clone();
				int tmp = b[zero];
				b[zero] = b[next[zero][i]];
				b[next[zero][i]] = tmp;
				Struct next_s = new Struct(b, now.c+1);
				if( !visited.contains(toString(b)) ) {
					visited.add(toString(b));
					que.addLast(next_s);
				}
			}
		}
		
		return now.c;
	}
	String toString(int[] a) {
		String ret = "";
		for(int i=0;i<8;i++) ret += a[i];
		return ret;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	class Struct {
		int[] s;
		int c;
		int zero;
		Struct(int s[], int c) {
			this.s = s.clone();
			this.c = c;
		}
	}
}