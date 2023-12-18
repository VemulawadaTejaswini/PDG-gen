/*
 *  author : Atul Anand   
 *  created on : Sat Mar 28 2020
 */

import java.io.*;
import java.util.*;

public class Main{
    static Map<Integer, Integer> dist = new HashMap<>();
    
  	public static void main(String[] args) throws IOException {
        int N = in.nextInt();
        int X = in.nextInt() - 1;
        int Y = in.nextInt() - 1;
        
        ArrayList<Integer> adj[] = new ArrayList[N];
        for(int i = 0; i < N; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 1; i < N-1; i++){
            adj[i].add(i-1);
            adj[i].add(i+1);
        }
        adj[0].add(1);
        adj[N-1].add(N-2);
        adj[X].add(Y);
        adj[Y].add(X);

        boolean visited[] = new boolean[N];
        for(int i = 0; i < N; i++){
            bfs(adj, i, visited);
            Arrays.fill(visited, false);
        }

        for(int k = 1; k < N; k++){
            println(dist.getOrDefault(k, 0)+" ");
        }

        in.close();
        out.close();
    }


    static void bfs(ArrayList<Integer> adj[], int source, boolean visited[]){
        Queue<Integer> q = new LinkedList();
        q.add(source);
        visited[source] = true;
        int level = 1;
        while(!q.isEmpty()){
            Queue<Integer> t = new LinkedList();
            while(!q.isEmpty()){
                int n = q.poll();
                for(int num: adj[n]){
                    if(!visited[num]){
                        visited[num] = true;
                        t.add(num);

                        if(num > source){
                            dist.put(level, dist.getOrDefault(level, 0) + 1);
                        }
                    }
                }
            }
            q = t;
            level++;
        }
    }

    static int MIN = Integer.MIN_VALUE;
    static int MAX = Integer.MAX_VALUE;
    static Reader in = new Reader();
    static PrintWriter out = new PrintWriter(System.out);

    static void read(int arr[], int N) throws IOException { 
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.nextInt(); 
    	} 
    }
    
    static void read(long arr[], int N) throws IOException { 
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.nextLong(); 
    	} 
    }
    
    static void read(String arr[], int N) throws IOException { 
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.next(); 
    	} 
    }
    
    static void print(Object O) {  
    	out.print(O); 
    }
    
    static void println(Object O) { 
    	out.println(O); 
    }
    
    static void println(int arr[]) { 
    	for(int i = 0; i < arr.length; i++){ 
    		print(arr[i]+" "); 
    	} 
    	println(""); 
    }

    static void println(int arr[][]) { 
    	for(int i = 0; i < arr.length; i++){ 
    		println(arr[i]); 
    	}
    }
    
    static void debug(Object O) { 
    	System.out.println(O); 
    }
}

class Reader {
    BufferedReader reader;
    StringTokenizer tokenizer;

    Reader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    String next() throws IOException {
        while (!tokenizer.hasMoreTokens() ) { 
            tokenizer = new StringTokenizer(reader.readLine()); 
        }
        return tokenizer.nextToken();
    }

    int nextInt() throws IOException { 
        return Integer.parseInt(next()); 
    }
    
    double nextDouble() throws IOException { 
        return Double.parseDouble(next());
    }
    
    long nextLong() throws IOException { 
        return Long.parseLong(next()); 
    }
    
    String nextLine() throws IOException { 
        return reader.readLine(); 
    }
    
    void close() throws IOException { 
        reader.close(); 
    }
}