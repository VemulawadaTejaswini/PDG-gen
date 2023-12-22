
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int MAX = 1000000000;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			
			LinkedList<Seg> list = new LinkedList<Seg>();
			for(int i=0;i<n;i++) {
//				for(Seg seg: list) debug(seg.id, seg.s, seg.e);
//				debug(" ");
				switch ( sc.next().charAt(0) ) {
				case 'W':
					int l = sc.nextInt();
					int mem = sc.nextInt();
					LinkedList<Seg> tmp = new LinkedList<Seg>();
				
					long s = 0; long e = mem;
					for(;!list.isEmpty();) {
						Seg seg = list.removeFirst();
						if(mem == 0) {
							tmp.add(seg);
							for(;!list.isEmpty();)
								tmp.addLast(list.removeFirst());
							break;
						}
						if( seg.s > s ) {
							e = min(s + mem, seg.s);
							mem -= (e-s);
							tmp.addLast(new Seg(l, s, e));
							tmp.addLast(seg);
						}
						else {
							tmp.addLast(seg);
						}
						s = seg.e;
					}
					if(mem != 0) tmp.addLast(new Seg(l, s, s+mem));
					list.clear();
					list.addAll(tmp);
					break;
				
				case 'D':
					l = sc.nextInt();
					tmp = new LinkedList<Seg>();
					for(;!list.isEmpty();) {
						Seg seg = list.removeFirst();
						if(seg.id == l);
						else tmp.addLast(seg);
					}
					
					list.clear();
					list.addAll(tmp);
					break;
				
				case 'R':
					int p = sc.nextInt();
					boolean flg = false;
					for(Seg seg: list) {
						if( seg.s <= p && p < seg.e ) {
							flg = true;
							System.out.println(seg.id);
						}
					}
					if(!flg) System.out.println(-1);
				}
			}
			System.out.println();
		}
	}
	
	class Seg {
		long id, s, e;
		Seg(long id, long s, long e) {
			this.s = s;
			this.id = id;
			this.e = e;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}