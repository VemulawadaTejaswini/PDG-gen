
import static java.lang.Math.*;
import static java.lang.System.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();

    public static int INF=100000000;
    public void run() {
    	while(true){
    		int N=10;

    		int[][] d=new int[N][N];

    		for(int i=0;i<N;i++)Arrays.fill(d[i],INF);
    		for(int i=0;i<N;i++)d[i][i]=0;

    		int n=sc.nextInt();
    		int city=0;
    		if(n==0)return;
    		for(int i=0;i<n;i++){
    			int f=sc.nextInt(),t=sc.nextInt(),c=sc.nextInt();
    			city=max(f,max(t,city));
    			d[f][t]=c;
    			d[t][f]=c;
    		}

    		warshall_floyd(d,new int[N][N]);

    		int mv=INF,mi=-1;
    		for(int i=0;i<=city;i++){
    			int v=0;
    			for(int j=0;j<=city;j++){
    				v+=d[i][j];
    			}

    			if(mv>v){
    				mi=i;
    				mv=v;
    			}
    		}

    		ln(mi+" "+mv);
        }
    }

	void warshall_floyd(int[][] d,int[][] prev){
		final int V=d.length;
	    for(int k=0;k<V;k++)
	    	for(int i=0;i<V;i++)for(int j=0;j<V;j++)
	    		if(d[i][j]>d[i][k] + d[k][j]){
	    			d[i][j]=d[i][k] + d[k][j];
	    			prev[i][j]=k;
	    		}
	}

    public static void main(String[] args) {
        new Main().run();
    }


	//output lib
	static final String br = System.getProperty("line.separator");
	static final String[] asep = new String[] { "", " ", br, br + br };

	static String str(Boolean o) {
		return o ? "YES" : "NO";
	}

	//	static String str(Double o){
	//		return String.format("%.8f",o);
	//	}
	static <K, V> String str(Map<K, V> map) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for (Entry<K, V> set : map.entrySet()) {
			if (!isFirst)
				sb.append(br);
			sb.append(str(set.getKey())).append(":").append(str(set.getValue()));
			isFirst = false;
		}
		return sb.toString();
	}

	static <E> String str(Collection<E> list) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for (E e : list) {
			if (!isFirst)
				sb.append(" ");
			sb.append(str(e));
			isFirst = false;
		}
		return sb.toString();
	}

	static String str(Object o) {
		int depth = _getArrayDepth(o);
		if (depth > 0)
			return _strArray(o, depth);
		Class<?> c = o.getClass();
		if (c.equals(Boolean.class))
			return str((Boolean) o);
		//if(c.equals(Double.class))return str((Double)o);

		return o.toString();
	}

	static int _getArrayDepth(Object o) {
		if (!o.getClass().isArray() || Array.getLength(o) == 0)
			return 0;
		return 1 + _getArrayDepth(Array.get(o, 0));
	}

	static String _strArray(Object o, int depth) {
		if (depth == 0)
			return str(o);
		StringBuilder sb = new StringBuilder();
		for (int i = 0, len = Array.getLength(o); i < len; i++) {
			if (i != 0)
				sb.append(asep[depth]);
			sb.append(_strArray(Array.get(o, i), depth - 1));
		}
		return sb.toString();
	}

	static void pr(Object... os) {
		boolean isFirst = true;
		for (Object o : os) {
			if (!isFirst)
				out.print(" ");
			out.print(o);
			isFirst = false;
		}
	}

	static void ln() {
		out.println();
	}

	static void ln(Object... os) {
		for (Object o : os) {
			pr(o);
			ln();
		}
	}
}