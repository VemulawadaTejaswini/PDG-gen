import java.awt.Point;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}

	static class Edge implements Comparable<Edge>{
		double dist;
		int to;

		public Edge(double dist,int to){
			this.dist=dist;
			this.to=to;
		}

		@Override
		public int compareTo(Edge o){
			return -Double.compare(dist,o.dist);
		}
	}

	public static void main(String[] $){
		Point start=new Point(getInt(),getInt()),goal=new Point(getInt(),getInt());
		int n=getInt();
		Point[] p=new Point[n+2];
		int[] r=new int[n+2];
		for(int i=0;i<n;++i){
			p[i]=new Point(getInt(),getInt());
			r[i]=getInt();
		}
		p[n]=start;
		p[n+1]=goal;

		HashMap<Integer,HashMap<Integer,Double>>dist=new HashMap<>();
		for(int i=0;i<n+2;i++){
			for(int j=i+1;j<n+2;j++){
				double d=Math.max(p[i].distance(p[j])-r[i]-r[j],0.0);
				dist.computeIfAbsent(i,HashMap::new);
				dist.computeIfAbsent(j,HashMap::new);
				dist.get(i).put(j,d);
				dist.get(j).put(i,d);
			}
		}
		//dist.entrySet().forEach(System.out::println);
		PriorityQueue<Edge> q=new PriorityQueue<>();
		q.add(new Edge(0,n));
		double[]res=new double[n+2];
		Arrays.fill(res,Double.MAX_VALUE/10);
		res[n]=0;
		while(!q.isEmpty()){
			int poll=q.poll().to;
			for(Entry<Integer,Double>e:dist.get(poll).entrySet()){
				int k=e.getKey();
				double v=e.getValue();
				if(res[k]>res[poll]+v)
					q.add(new Edge(-(res[k]=res[poll]+v),k));
			}
		}
		System.out.printf("%.20f\n",res[n+1]);
	}
}