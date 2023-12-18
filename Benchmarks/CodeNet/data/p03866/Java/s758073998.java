import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}

	static class DEdge implements Comparable<DEdge>{
		int f,t;double c;
		public DEdge(int from,int to,double cost){f=from;t=to;c=cost;}
		@Override
		public String toString(){
			return "("+f+","+t+")="+c;
		}
		@Override
		public int compareTo(DEdge o){
			double v=c-o.c;
			return v==0?0:v>0?1:-1;
		}

		@Override
		public int hashCode(){
			final int prime=31;
			int result=1;
			long temp=Double.doubleToLongBits(c);
			result=prime*result+(int)(temp^(temp>>>32));
			result=prime*result+f;
			result=prime*result+t;
			return result;
		}
		@Override
		public boolean equals(Object obj){
			if(this==obj) return true;
			if(obj==null||getClass()!=obj.getClass()) return false;
			DEdge other=(DEdge)obj;
			if(Double.doubleToLongBits(c)!=Double.doubleToLongBits(other.c)||f!=other.f||t!=other.t) return false;
			return true;
		}
	}

	static class Barrier{
		Point pos;
		int r;
		public Barrier(Point pos,int r){
			this.pos=pos;
			this.r=r;
		}
	}

	public static void main(String[]$){
		ArrayList<Barrier>barriers=new ArrayList<>();
		ArrayList<List<DEdge>>edges=new ArrayList<>();
		PriorityQueue<DEdge>neighbor=new PriorityQueue<>();

		get(barriers,edges,new Barrier(new Point(getInt(),getInt()),0));
		get(barriers,edges,new Barrier(new Point(getInt(),getInt()),0));
		int n=getInt();
		for(int i=0;i<n;++i)
			get(barriers,edges,new Barrier(new Point(getInt(),getInt()),getInt()));

		double[]dist=new double[n+2];
		Arrays.fill(dist,Double.MAX_VALUE);
		dist[0]=0;

		neighbor.addAll(edges.get(0));

		loop:
		while(true){
			DEdge poll=neighbor.poll();
			if(dist[poll.t]==Double.MAX_VALUE){
				dist[poll.t]=dist[poll.f]+poll.c;
				if(poll.t==1)
					break loop;
				edges.get(poll.t).stream()
				.filter(o->dist[o.t]==Double.MAX_VALUE)
				.forEach(neighbor::add);
			}
		}
		System.out.println(dist[1]);
	}
	private static void get(List<Barrier> barriers,List<List<DEdge>> edges,Barrier b){
		edges.add(new ArrayList<>());
		barriers.add(b);
		int last=barriers.size()-1;
		for(int FOR=0;FOR<last;++FOR) {
			Barrier o=barriers.get(FOR);
			double distance=Math.max(0,b.pos.distance(o.pos)-o.r-b.r);
			edges.get(FOR).add(new DEdge(FOR,last,distance));
			edges.get(last).add(new DEdge(last,FOR,distance));
		}
	}
}