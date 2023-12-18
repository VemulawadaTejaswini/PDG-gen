

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int H=gi();
	    int W=gi();
	    char[][] C=new char[H][W];
	    List<Edge>[] E=new ArrayList[H*W];
	    int wc=0;
	    for(int i=0; i<H;i++) {
	    	String s=gs();
	    	for (int j=0; j<W;j++) {
	    		C[i][j]=s.charAt(j);
	    		if(C[i][j]=='.')wc++;
	    	}
	    }

	    for(int i=0; i<H*W;i++) {
	    	E[i]=new ArrayList<Edge>();
	    }
	    for(int i=0; i<H;i++) {
	    	for (int j=0; j<W;j++) {
	    		if(C[i][j]=='.') {
	    			if(i-1>=0 && C[i-1][j]=='.') E[i*W+j].add(new Edge(i*W+j, (i-1)*W+j, 1));
	    			if(i+1<H && C[i+1][j]=='.') E[i*W+j].add(new Edge(i*W+j, (i+1)*W+j, 1));
	    			if(j-1>=0 && C[i][j-1]=='.') E[i*W+j].add(new Edge(i*W+j, i*W+j-1, 1));
	    			if(j+1<W && C[i][j+1]=='.') E[i*W+j].add(new Edge(i*W+j, i*W+j+1, 1));
	    		}
	    	}
	    }

	    long[] d=new long[H*W];
	    for(int i=0; i<H*W;i++) {
	    	d[i]=Integer.MAX_VALUE;
	    }
	    d[0]=0;

	    PriorityQueue<Pair<Long, Integer>> que=new PriorityQueue<Pair<Long, Integer>>();
	    que.add(new Pair<Long, Integer>(0l,0));

	    while(!que.isEmpty()) {
	    	Pair<Long, Integer> p=que.poll();
	    	int v=p.getValue();
	    	long cost=p.getKey();
	    	if(d[v]<cost)continue;
	    	for(int i=0; i<E[v].size();i++) {
	    		Edge e=E[v].get(i);
	    		if(d[e.from]!=Integer.MAX_VALUE && e.cost !=Integer.MAX_VALUE && d[e.to] > d[e.from]+e.cost) {
	    			d[e.to]=d[e.from]+e.cost;
	    			que.add(new Pair<Long, Integer>(d[e.to], e.to));
	    		}
	    	}
	    }

	    if(d[H*W-1]!=Integer.MAX_VALUE) {
            System.out.println(wc-d[H*W-1]-1);
	    } else {
	    	System.out.println(-1);
	    }
	}

	public static class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> implements Comparable<Pair<K, V>> {
		/** serialVersionUID. */
	    private static final long serialVersionUID = 6411527075103472113L;

	    public Pair(final K key, final V value) {
	        super(key, value);
	    }

		@Override
		public int compareTo(Pair<K, V> o) {

			Comparable key = (Comparable)this.getKey();
			Comparable key2 = (Comparable)o.getKey();

			return key.compareTo(key2);
		}

	}

	public static class Edge {
	    private int from;
	    private int to;
	    private long cost;

	    public Edge(int f, int t, long c) {
	    	this.from=f;
	    	this.to=t;
	    	this.cost=c;
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