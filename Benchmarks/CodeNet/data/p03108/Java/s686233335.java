/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
    static class Edge {
        int a;
        int b;
        Edge(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    static class UD {
        int parent;
        int rank;
        long size;
        UD(int parent, int rank, long size) {
            this.parent = parent;
            this.rank = rank;
            this.size = size;
        }
    }
    
    static Edge[] edges;
    static UD[] set;
    static long[] pairs;
    
    private static UD findParent(int k) {
        if(set[k].parent == k) {
            return set[k];
        }
        return findParent(set[k].parent);
    }
    
    private static void union(int x, int y) {
        UD xparent = findParent(x);
        UD yparent = findParent(y);
        
        //System.out.println("union " + xparent.size + " " + yparent.size);
        
        if(xparent.rank < yparent.rank) {
            set[xparent.parent].parent = yparent.parent;
            set[yparent.parent].size += xparent.size;
        } else if(xparent.rank > yparent.rank) {
            set[yparent.parent].parent = xparent.parent;
            set[xparent.parent].size += yparent.size;
        } else {
            set[yparent.parent].parent = xparent.parent;
            set[xparent.parent].size += yparent.size;
            set[xparent.parent].rank++;
        }
    }
    
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
	    StringTokenizer s = new StringTokenizer(br.readLine());
	    int n = Integer.parseInt(s.nextToken());
	    int m = Integer.parseInt(s.nextToken());
	    
	    edges = new Edge[m];
	    
	    for(int i = 0; i < m; i++) {
	        s = new StringTokenizer(br.readLine());
	        int x = Integer.parseInt(s.nextToken());
	        int y = Integer.parseInt(s.nextToken());
	        edges[i] = new Edge(x-1, y-1);
	    }
	    
	    set = new UD[n];
	    for(int i = 0; i < n; i++) {
	        set[i] = new UD(i, 0, 1);
	    }
	    
	    pairs = new long[m];
	    
	    
	    long total = 0;
	    for(int i = m-1; i >= 0; i--) {
	        //System.out.println("before :::: i : " + i + ", total : " + total);
	        pairs[i] = total;
	        UD x = findParent(edges[i].a);
	        UD y = findParent(edges[i].b);
	        if(x.parent == y.parent) {
	            continue;
	        }
	        long xsize = x.size;
	        long ysize = y.size;
	        union(edges[i].a, edges[i].b);
	        UD z = findParent(edges[i].a);
	        long zsize = z.size;
	        //System.out.println("x : " + xsize + " y : " + ysize + " z : " + zsize);
	        total = total - ((xsize*(xsize-1L))/2L) - ((ysize*(ysize-1L))/2L) + (z.size*(z.size-1L))/2L;
	        //System.out.println("after: total : " + total);
	    }
	    
	    long nodes = n;
	    long totalPairs = (nodes*(nodes-1))/2L;
	    
	    for(int i = 0; i < m; i++) {
	        out.println(totalPairs - pairs[i]);
	    }
	    out.flush();
	    
	}
}
