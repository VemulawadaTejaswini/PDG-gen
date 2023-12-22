
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int M=gi();
         List<Edge>[] G=new ArrayList[N+1];
         Map<Integer,Integer> map=new HashMap<Integer,Integer>();

         for (int i=0; i<N+1;i++) {
        	 G[i]=new ArrayList<Edge>();

         }
         for (int i=0; i<M;i++) {
        	 int a=gi();
        	 int b=gi();
        	 G[a].add(new Edge(a, b, 1l));
        	 G[b].add(new Edge(b, a, 1l));
         }

         int[] d=new int[N+1];
         for(int i=0; i<N+1;i++) {
        	 d[i]=Integer.MAX_VALUE;
         }
         Queue<Integer> q=new ArrayBlockingQueue<Integer>(N+1);
         q.add(1);
         d[1]=0;
         while(!q.isEmpty()) {
        	 int v=q.poll();
        	 List<Edge> l=G[v];
        	 for (int i=0; i<l.size();i++) {
        		 Edge e=l.get(i);
        		 int to=e.to;
        		 if(d[to]==Integer.MAX_VALUE) {
        		     q.add(to);
        		     map.put(to, e.from);
                     d[to]=d[e.from]+1;
        		 }
        	 }
         }

         StringBuilder ans=new StringBuilder();
         ans.append("Yes");
    	 ans.append(System.lineSeparator());
         for(int i=2;i<=N;i++) {
        	 ans.append(map.get(i));
        	 ans.append(System.lineSeparator());
         }
         System.out.println(ans);
     }

     public static class Edge implements Comparable {
    	    private int from;
    	    private int to;
    	    private long cost;

    	    public Edge(int f, int t, long c) {
    	    	this.from=f;
    	    	this.to=t;
    	    	this.cost=c;
    	    }

			@Override
			public int compareTo(Object o) {
                if(this.cost>((Edge)o).cost) {
                	return 1;
                } else if(this.cost<((Edge)o).cost) {
                	return -1;
                }
				return 0;
			}
    	}

     // 文字列として入力を取得
     public static String gs() {
          return scanner.next();
     }

     // intとして入力を取得
     public static int gi() {
          return Integer.parseInt(scanner.next());
     }

     // longとして入力を取得
     public static long gl() {
          return Long.parseLong(scanner.next());
     }

     // doubleとして入力を取得
     public static double gd() {
          return Double.parseDouble(scanner.next());
     }
}