
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	long n;
	int m;
	long p;
	long q;
	long r;
	LinkedList<Segment> card;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextLong();
			if( n == 0) break;
			card = new LinkedList<Segment>();
			card.add(new Segment(1, n));
			m = sc.nextInt();
			p = sc.nextLong();
			q = sc.nextLong();
			r = sc.nextLong();
			LinkedList<Segment> a = new LinkedList<Segment>();
			LinkedList<Segment> b = new LinkedList<Segment>();
			LinkedList<Segment> c = new LinkedList<Segment>();
			for(int i=0;i<m;i++) {
				long x = sc.nextLong();
				long y = sc.nextLong();
				for(;!card.isEmpty();) {
//					System.out.println(x +" " + y);
					Segment s = card.removeFirst();
					if(s.size <= x ) {
						a.addLast(s);
						x -= s.size;
						y -= s.size;
					}
					else if( x>0 && s.size > x){
						Segment[] sp = s.split(x);
						card.addFirst(sp[1]);
						a.addLast(sp[0]);
						y -= x;
						x = 0;
						continue;
					}
					else if( s.size <= y ) {
						b.addLast(s);
						y -= s.size;
					}
					else if(y>0 && s.size > y) {
						Segment[] sp = s.split(y);
						card.addFirst(sp[1]);
						b.addLast(sp[0]);
						y = 0;
					}
					else {
						c.addLast(s);
					}
				}
				card.addAll(c);
				card.addAll(b);
				card.addAll(a);
				a.clear();
				b.clear();
				c.clear();
				
//				for(Segment s: card) System.err.println("(" + s.s + "," + s.e + ")");
//				System.err.println();
			}
			long ans = 0;
			for(;!card.isEmpty();) {
				Segment s = card.removeFirst();
				if(s.size < p) {
					p -= s.size;
					q -= s.size;
				}
				else if(p > 0 && s.size>=p) {
					if(s.size == 1) {
						ans += s.cntElement(r);
					}
					else {
						Segment[] sp = s.split(p);
						card.addFirst(sp[1]);
					}
					
					q -= p;
					p = 0;
				}
				else if(q > s.size) {
					q -= s.size;
					ans += s.cntElement(r);
				}
				else if(s.size>=q) {
					Segment[] sp = s.split(q);
					ans += sp[0].cntElement(r);
					break;
				}
			}
			System.out.println(ans);
		}
	}
	
	void debug(Object...os){
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
	class Segment {
		long s, e;
		long size;
		Segment (long s, long e) {
			this.s = s;
			this.e = e;
			size = e-s+1;
		}
		
		Segment[] split(long x) {
			Segment[] sp = new Segment[2];
			sp[0] = new Segment(s, s+x-1);
			sp[1] = new Segment(s+x, e);
			return sp;
		}
		
		long cntElement(long r) {
			if(r >= e) return size;
			else if( r>= s) return r-s+1;
			return 0;
		}
	}
}