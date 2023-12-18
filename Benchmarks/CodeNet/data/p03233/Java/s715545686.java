import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Main{
	static Scanner s=new Scanner(System.in);
	
	class E{
		int a,b;
		public E(int a,int b){
			this.a=a;
			this.b=b;
		}
		public int getA(){
			return a;
		}
		public int getB(){
			return b;
		}
	}
	
	void solve(){
		int n=gInt();
		
		PriorityQueue<E>qa=new PriorityQueue<>(Comparator.comparingInt(E::getA));
		TreeSet<E>qb=new TreeSet<>(Comparator.comparingInt(E::getB).reversed());
		
		for(int i=0;i<n;++i) {
			E o=new E(gInt(),gInt());
			qa.add(o);
			qb.add(o);
		}
		
		long r=0;
		for(int i=0;i<n;++i) {
			E o=qa.poll();
			E p=null;
			for(E t:qb) {
				if(t.b>=0&&o!=t) {
					p=t;
					break;
				}
			}
			r+=Math.min(o.a,p.b);
			p.b*=-1;
		}
		System.out.println(r);
	}

	public static void main(String[] A){
		new Main().solve();
	}

	static int gInt(){
		return Integer.parseInt(s.next());
	}
	static long gLong(){
		return Long.parseLong(s.next());
	}
	static double gDouble(){
		return Double.parseDouble(s.next());
	}

	IntStream REP(int n){
		return REP(0,n-1);
	}
	IntStream REP(int l,int r){
		return IntStream.rangeClosed(l,r);
	}

	IntStream INTS(int n){
		return IntStream.generate(Main::gInt).limit(n);
	}
}
