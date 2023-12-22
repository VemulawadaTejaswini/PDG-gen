

import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;
import static java.lang.Math.*;
import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();


	static final int INF =1<<30;

	static class Node{
		int id;
		List<Edge> link=new LinkedList<Edge>();
		Node(int _id){
			id=_id;
		}
	}
	static class Edge{
		int from,to,cost;
		Edge(int _from,int _to,int _cost){
			from=_from;to=_to;cost=_cost;
		}
		public String toString() {
			return from+"->"+to;
		}
	}
	static class Task implements Comparable<Task>{
		int prev,pos,cost;
		Task(int _prev,int _pos,int _cost){
			prev=_prev;pos=_pos;cost=_cost;
		}
		@Override
		public int compareTo(Task T) {
			return cost-T.cost;
		}
	}
	public static int[] dijkstra(Node[] graph,int s,int[] prev){
		final int V=graph.length;
		int[] d=new int[V];Arrays.fill(d,INF);d[s]=0;
		Arrays.fill(prev,-2);
		PriorityQueue<Task> que=new PriorityQueue<Task>();
		que.add(new Task(-1,s,0));
		while(!que.isEmpty()){
			Task task=que.poll();
			if(prev[task.pos]!=-2)continue;
			//if(d[task.pos]<task.cost)continue;
			prev[task.pos]=task.prev;
			for(Edge e:graph[task.pos].link){
				if(d[e.to]>d[e.from]+e.cost){
					d[e.to]=d[e.from]+e.cost;
					que.add(new Task(e.from,e.to,d[e.to]));
				}
			}
		}
		return d;
	}

	public int enc(int v,int l){
		return (L+1)*v+l;
	}
	public int decL(int id){
		return id%(L+1);
	}
	public int decV(int id){
		return id/(L+1);
	}
	int N,M,L;
	public void run() {

		TCase:while(true){
			N=sc.nextInt();M=sc.nextInt();L=sc.nextInt();
			if(N==0)return;
			Node[] graph=new Node[N*(L+1)];
			for(int i=0;i<N;i++)for(int j=0;j<=L;j++)
				graph[enc(i,j)]=new Node(enc(i,j));

			//edge
			for(int i=0;i<M;i++){
				int f=sc.nextInt()-1,t=sc.nextInt()-1;
				int d=sc.nextInt(),c=sc.nextInt();
				for(int l=0;l<=L;l++)if(l-d>=0){
					graph[enc(f,l)].link.add(new Edge(enc(f,l),enc(t,l-d),0));
					graph[enc(t,l)].link.add(new Edge(enc(t,l),enc(f,l-d),0));
				}
				for(int l=0;l<=L;l++){
					graph[enc(f,l)].link.add(new Edge(enc(f,l),enc(t,l),c));
					graph[enc(t,l)].link.add(new Edge(enc(t,l),enc(f,l),c));
				}
			}
			int[] prev=new int[N*(L+1)];
			int[] d=dijkstra(graph,enc(0,L),prev);

			int mv=INF;
			for(int l=0;l<=L;l++)
				mv=min(mv,d[enc(N-1,l)]);

			//ln(strPath(path(prev,enc(N-1,0))));
			ln(mv);
		}
	}

	public String strPath(List<Integer> path){
		String res="";
		for(Integer v:path){
			res+="("+decV(v)+","+decL(v)+")--";
		}
		return res;
	}
	//パスの出力
	public static List<Integer> path(int[] prev,int e){
		List<Integer> path=new ArrayList<Integer>();
		for (int u = e; u >= 0; u = prev[u])
			path.add(u);
		Collections.reverse(path);
		return path;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	//output lib
	static final String br=System.getProperty("line.separator");
	static final String[] asep=new String[]{""," ",br,br+br};
	static String str(Boolean o){
		return o?"YES":"NO";
	}
//	static String str(Double o){
//		return String.format("%.8f",o);
//	}
	static <K,V> String str(Map<K, V> map){
		StringBuilder sb=new StringBuilder();
		boolean isFirst=true;
		for(Entry<K,V> set:map.entrySet()){
			if(!isFirst)sb.append(br);
			sb.append(str(set.getKey())).append(":").append(str(set.getValue()));
			isFirst=false;
		}
		return sb.toString();
	}
	static <E> String str(Collection<E> list){
		StringBuilder sb=new StringBuilder();
		boolean isFirst=true;
		for(E e:list){
			if(!isFirst)sb.append(" ");
			sb.append(str(e));
			isFirst=false;
		}
		return sb.toString();
	}

	static String str(Object o){
		int depth=_getArrayDepth(o);
		if(depth>0)return _strArray(o,depth);
		Class<?> c=o.getClass();
		if(c.equals(Boolean.class))return str((Boolean)o);
		//if(c.equals(Double.class))return str((Double)o);

		return o.toString();
	}
	static int _getArrayDepth(Object o){
		if(!o.getClass().isArray() || Array.getLength(o)==0) return 0;
		return 	1+_getArrayDepth(Array.get(o,0));
	}
	static String _strArray(Object o,int depth){
		if(depth==0) return str(o);
		StringBuilder sb=new StringBuilder();
		for(int i=0,len=Array.getLength(o);i<len;i++){
			if(i!=0)sb.append(asep[depth]);
			sb.append(_strArray(Array.get(o,i),depth-1));
		}
		return sb.toString();
	}
	static void pr(Object... os){
		boolean isFirst=true;
		for(Object o:os){
			if(!isFirst)out.print(" ");
			out.print(o);
			isFirst=false;
		}
	}
	static void ln(){
		out.println();
	}
	static void ln(Object... os){
		for(Object o:os){
			pr(o);ln();
		}
	}
}