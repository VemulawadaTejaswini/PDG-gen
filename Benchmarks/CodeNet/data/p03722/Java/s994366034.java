
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int M=gi();
	    Edge[] E=new Edge[M];

        for(int i=0; i<M; i++) {
        	int a=gi()-1;
        	int b=gi()-1;
        	int c=-gi();
        	E[i]=new Edge(a, b, c);
        }

        long[] k=new long[N];
        for(int i=1; i<N; i++) {
        	k[i]=Long.MAX_VALUE;
        }

        int cnt=0;
        long tmp=Long.MAX_VALUE;
        while(true) {
        	boolean isk=false;
        	for(int i=0; i<M;i++) {
        		Edge e=E[i];
        		if (k[e.gfrom()]!=Long.MAX_VALUE && k[e.gto()]>k[e.gfrom()]+e.gcost()) {
        		    k[e.gto()]=k[e.gfrom()]+e.gcost();
        		    isk=true;
        		}
        	}

        	if(!isk) {
        		break;
        	}

        	cnt++;
        	if(cnt==N) {
        		tmp=k[N-1];
        	}
        	if(cnt==2*N) {
        		if(tmp>k[N-1]) {
        			System.out.println("inf");
        			return;
        		}else {
        			break;
        		}
        	}
        }

        System.out.println(-k[N-1]);
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

	    public int gfrom() {
	    	return from;
	    }

	    public int gto() {
	    	return to;
	    }

	    public long gcost() {
	    	return cost;
	    }

	    public void sfrom(int f) {
	    	from=f;
	    }

	    public void sto(int t) {
	    	to=t;
	    }

	    public void scost(int c) {
	    	cost=c;
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