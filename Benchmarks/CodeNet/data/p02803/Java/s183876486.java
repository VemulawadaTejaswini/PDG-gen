import java.awt.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main{
	Scanner s=new Scanner(System.in);

	int h=gInt(),w=gInt();
	char[][] f=new char[h][w];
	{
		for(int i=0;i<h;++i)
			s.next().getChars(0,w,f[i],0);
	}

	void solve(){
		Point p=null;
		for(int i=0;i<h;++i){
			for(int j=0;j<w;++j){
				if(f[i][j]=='.'){
					p=new Point(j,j);
					break;
				}
			}
		}
		Point a=bfs_a(p,'.','_');
		System.out.println(bfs_b(a,'_','.'));
	}

	int[] dx={0,1,0,-1};
	int[] dy={1,0,-1,0};
	ArrayDeque<Point> q=new ArrayDeque<>();
	Point bfs_a(Point p,char c,char c2){
		q.add(p);
		f[p.y][p.x]=c2;
		Point poll=null;
		while(!q.isEmpty()){
			poll=q.poll();
			for(int d=0;d<4;++d){
				int Y=poll.y+dy[d];
				int X=poll.x+dx[d];
				if(0<=Y&&Y<h&&0<=X&&X<w&&f[Y][X]==c){
					f[Y][X]=c2;
					q.add(new Point(X,Y));
				}
			}
		}
		return poll;
	}
	int bfs_b(Point p,char c,char c2){
		q.add(p);
		f[p.y][p.x]=c2;
		int depth=-1;
		for(;!q.isEmpty();++depth){
			for(int count=q.size();count>0;--count){
				Point poll=q.poll();
				for(int d=0;d<4;++d){
					int Y=poll.y+dy[d];
					int X=poll.x+dx[d];
					if(0<=Y&&Y<h&&0<=X&&X<w&&f[Y][X]==c){
						f[Y][X]=c2;
						q.add(new Point(X,Y));
					}
				}
			}
		}
		return depth;
	}

	public static void main(String[] args){
		new Main().solve();
	}

	int gInt(){
		return Integer.parseInt(s.next());
	}
	long gLong(){
		return Long.parseLong(s.next());
	}
	double gDouble(){
		return Double.parseDouble(s.next());
	}

	SupplyingIterator<Integer> ints(int n){
		return new SupplyingIterator<>(n,this::gInt);
	}
	SupplyingIterator<Long> longs(int n){
		return new SupplyingIterator<>(n,this::gLong);
	}
	SupplyingIterator<Double> doubles(int n){
		return new SupplyingIterator<>(n,this::gDouble);
	}
	SupplyingIterator<String> strs(int n){
		return new SupplyingIterator<>(n,s::next);
	}

	Range rep(int i){
		return Range.rep(i);
	}
	Range rep(int f,int t,int d){
		return Range.rep(f,t,d);
	}
	Range rep(int f,int t){
		return rep(f,t,1);
	}
	Range rrep(int f,int t){
		return rep(t,f,-1);
	}

	IntStream REP(int v){
		return IntStream.range(0,v);
	}
	IntStream REP(int l,int r){
		return IntStream.rangeClosed(l,r);
	}

	IntStream INTS(int n){
		return IntStream.generate(this::gInt).limit(n);
	}
	LongStream LONGS(int n){
		return LongStream.generate(this::gLong).limit(n);
	}
	Stream<String> STRS(int n){
		return Stream.generate(s::next).limit(n);
	}

}

class SupplyingIterator<T> implements Iterable<T>,Iterator<T>{
	int t;
	Supplier<T> supplier;

	SupplyingIterator(int t,Supplier<T> supplier){
		this.t=t;
		this.supplier=supplier;
	}

	@Override
	public Iterator<T> iterator(){
		return this;
	}

	@Override
	public boolean hasNext(){
		return t>0;
	}

	@Override
	public T next(){
		--t;
		return supplier.get();
	}

}

class Range implements Iterable<Integer>,PrimitiveIterator.OfInt{
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
}
