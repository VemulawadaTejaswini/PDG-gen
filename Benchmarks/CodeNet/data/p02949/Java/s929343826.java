import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
        @@@@@@           @@@@@@
      @@@@@@@@@@       @@@@@@@@@@ 
    @@@@@@@@@@@@@@   @@@@@@@@@@@@@@
  @@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@@@
 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@
        @@@@@@@@@@@@@@@@@@@@@@@
          @@@@@@@@@@@@@@@@@@@
            @@@@@@@@@@@@@@@
              @@@@@@@@@@@
                @@@@@@@
                  @@@
                   @ 
*/
public class Main {
	static int BellmanFord(int graph[][], int V, int E, 
            int src) 
{ 
// Initialize distance of all vertices as 0. 
int []dis = new int[V]; 
for (int i = 0; i < V; i++) {
    dis[i] = Integer.MAX_VALUE;
}

// initialize distance of source as 0 
dis[src] = 0; 

// Relax all edges |V| - 1 times. A simple 
// shortest path from src to any other 
// vertex can have at-most |V| - 1 edges 
for (int i = 0; i < V - 1; i++)  
{ 

    for (int j = 0; j < E; j++)  
    { 
        if (dis[graph[j][0]] + graph[j][2] < 
                        dis[graph[j][1]]) {
            dis[graph[j][1]] =  
            dis[graph[j][0]] + graph[j][2];
        }
    } 
} 

// check for negative-weight cycles. 
// The above step guarantees shortest 
// distances if graph doesn't contain 
// negative weight cycle. If we get a 
// shorter path, then there is a cycle. 
for (int i = 0; i < E; i++)  
{ 
    int x = graph[i][0]; 
    int y = graph[i][1]; 
    int weight = graph[i][2]; 
    if (dis[x] != Integer.MAX_VALUE && 
            dis[x] + weight < dis[y]) {
    	return 1;}
} 

return dis[dis.length-1];
} 

//Driver code 
public static void main(String[] args)  throws Exception
{ 

int V = i(); // Number of vertices in graph 
int E = i(); // Number of edges in graph 
int[][] graph = new int[E][3];
// Every edge has three values (u, v, w) where 
// the edge is from vertex u to v. And weight 
// of the edge is w. 
int[][] stuff = new int[E][3];
int p = i();
for (int i=0; i<E; i++) {
	for (int j=0; j<3; j++) {
		stuff[i][j] = i();
	}
}
for (int i=0; i<E; i++) {
	graph[i][0] = stuff[i][0]-1;
	graph[i][1] = stuff[i][1]-1;
	graph[i][2] = p-stuff[i][2];
}
int temp = BellmanFord(graph, V, E, 0); 
if (temp>0) {
	System.out.println("-1");
	return;
}
System.out.println(-temp);
} 
	
	static BufferedReader in;
	static StringTokenizer st = new StringTokenizer("");
	//static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static PrintWriter out;
	static {
		try {
			in = Files.newBufferedReader(Paths.get("TEMPLATE.in"));
			out = new PrintWriter(new BufferedWriter(new FileWriter("TEMPLATE.out")));
		} catch (Exception e) {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		}
	}
	/*static {
		in = new BufferedReader(new InputStreamReader(System.in));
	}*/
	static void check() throws Exception {
		while (!st.hasMoreTokens()) st = new StringTokenizer(in.readLine());
	}
	static String s() throws Exception { check(); return st.nextToken(); }
	static int i() throws Exception { return Integer.parseInt(s()); }
	static long l() throws Exception { return Long.parseLong(s()); }
	static double d() throws Exception { return Double.parseDouble(s()); }
}
