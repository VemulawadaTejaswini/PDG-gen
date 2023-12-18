import java.awt.Point;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main{

	class Edge implements Comparable<Edge>{
		int cost;
		Point to;

		public Edge(int cost,Point to){
			this.cost=cost;
			this.to=to;
		}

		@Override
		public int compareTo(Edge o){
			return cost-o.cost;
		}

		@Override
		public String toString(){
			return "Edge [cost="+cost+", to="+to+"]";
		}
	}

	private void solve(){
		PriorityQueue<Edge> q=new PriorityQueue<>();
		int h=gInt(),w=gInt();
		int[]ch=ints(w).toArray(),cv=ints(h).toArray();
		long r=0;
		q.add(new Edge(0,new Point(0,0)));
		boolean[][]f=new boolean[h+1][w+1];
		while(!q.isEmpty()){
			Edge poll=q.poll();
			if(f[poll.to.y][poll.to.x])
				continue;
			//System.out.println(poll);
			f[poll.to.y][poll.to.x]=true;
			r+=poll.cost;
			if(poll.to.x<w&&!f[poll.to.y][poll.to.x+1])
				q.add(new Edge(ch[poll.to.x],new Point(poll.to.x+1,poll.to.y)));
			if(poll.to.x>0&&!f[poll.to.y][poll.to.x-1])
				q.add(new Edge(ch[poll.to.x-1],new Point(poll.to.x-1,poll.to.y)));
			if(poll.to.y<h&&!f[poll.to.y+1][poll.to.x])
				q.add(new Edge(cv[poll.to.y],new Point(poll.to.x,poll.to.y+1)));
			if(poll.to.y>0&&!f[poll.to.y-1][poll.to.x])
				q.add(new Edge(cv[poll.to.y-1],new Point(poll.to.x,poll.to.y-1)));
		}
		System.out.println(r);
	}

	public static void main(String[]$){
		new Main().solve();
	}

	static Scanner s=new Scanner(System.in);


	static int gInt(){
		return s.nextInt();
	}
	static long gLong(){
		return s.nextLong();
	}
	static long gDouble(){
		return s.nextLong();
	}


	static Range rep(int i){
		return new Range(i);
	}
	static Range rep(int f,int t,int d){
		return new Range(f,t,d);
	}
	static Range rep(int f,int t){
		return rep(f,t,1);
	}
	static Range rrep(int f,int t){
		return rep(f,t,-1);
	}

	static class Range implements Iterable<Integer>,PrimitiveIterator.OfInt{

		int to,cur,d;

		Range(int from,int to,int d){
			this.cur=from-d;
			this.to=to;
			this.d=d;
		}

		Range(int n){
			this(0,n-1,1);
		}

		@Override
		public Iterator<Integer> iterator(){
			return this;
		}

		@Override
		public boolean hasNext(){
			return cur+d==to||(cur!=to&&(cur<to==cur+d<to));
		}

		@Override
		public int nextInt(){
			return cur+=d;
		}
	}


	static IntStream REPS(int v){
		return IntStream.range(0,v);
	}

	static IntStream REPS(int l,int r){
		return IntStream.rangeClosed(l,r);
	}


	static IntStream ints(int n){
		return REPS(n).map(i->gInt());
	}

	static Stream<String> strs(int n){
		return REPS(n).mapToObj(i->s.next());
	}

}
