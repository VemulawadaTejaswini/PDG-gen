import java.util.Arrays;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main{
	static class UF{
		public int[] uni;
		public UF(int size){
			uni=new int[size];
			Arrays.fill(uni,-1);
		}
		public int root(int t){
			if(uni[t]<0)
				return t;
			return uni[t]=root(uni[t]);
		}
		public boolean connect(int p,int c){
			p=root(p);
			c=root(c);
			if(p==c)
				return false;
			if(uni[p]>uni[c]){
				final int buf=c;
				c=p;
				p=buf;
			}
			uni[p]+=uni[c];
			uni[c]=p;
			return true;
		}
		public boolean isConnected(int a,int b){
			return root(a)==root(b);
		}
		public int groupSize(int t){
			return -uni[root(t)];
		}
	}

	class El implements Comparable<El>{
		int treeno,cost;

		public El(int treeno,int cost){
			this.treeno=treeno;
			this.cost=cost;
		}

		@Override
		public int compareTo(El o){
			return cost-o.cost;
		}
	}

	private void solve(){
		int n=gInt(),m=gInt();
		int[]cost=ints(n).toArray();

		UF treediv=new UF(n);
		TreeMap<Integer,PriorityQueue<El>>tm=new TreeMap<>();
		for(int v:rep(m)) {
			int a=gInt(),b=gInt();
			treediv.connect(Math.min(a,b),Math.max(a,b));
		}
		for(int i=0;i<n;++i) {
			tm.computeIfAbsent(treediv.root(i),(o)->new PriorityQueue<>())
			.add(new El(treediv.root(i),cost[i]));
		}
		UF connected=new UF(n);
		long res=0;

		if(tm.size()==1) {//1hon
			System.out.println(0);
			return;
		}
		//1choutenn
		int[]lonelyno=tm.entrySet().stream()
				.filter(o->o.getValue().size()==1)
				.mapToInt(o->o.getKey()).toArray();
		try {
			//1c sakujo
			res+=Arrays.stream(lonelyno).mapToLong(o->tm.get(o).peek().cost).sum();
			tm.entrySet().removeIf(o->o.getValue().size()==1);

			if(tm.isEmpty()&&lonelyno.length==2) {
				System.out.println(cost[lonelyno[0]]+cost[lonelyno[1]]);
				return;
			}

			//genten
			int firstroot=tm.keySet().stream().findAny().get();


			while(true) {

				if(connected.groupSize(firstroot)==tm.size())
					break;
				//allconnected

				El from=tm.values().stream().map(o->o.peek())
						.filter(o->connected.isConnected(o.treeno,firstroot))
						.findFirst().get();
				El to=tm.values().stream().map(o->o.peek())
						.filter(o->!connected.isConnected(o.treeno,firstroot))
						.findFirst().get();

				connected.connect(from.treeno,to.treeno);
				res+=from.cost+to.cost;

				tm.get(from.treeno).poll();
				tm.get(to.treeno).poll();
			}
			long[]spare=tm.values().stream().flatMapToLong(o->o.stream().mapToLong(p->p.cost))
					.sorted()
					.limit(lonelyno.length)
					.toArray();
			if(spare.length<lonelyno.length)
				throw new Exception();
			System.out.println(res+Arrays.stream(spare).sum());
		}catch (Exception e) {
			System.out.println("Impossible");
		}
	}

	public static void main(String[] $){
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
