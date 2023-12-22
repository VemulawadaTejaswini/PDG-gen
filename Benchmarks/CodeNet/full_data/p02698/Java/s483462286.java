/*
    Arnab Chanda 
*/

// All imports here

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;

import org.w3c.dom.Node;

// Template code starts here //

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Debugger debug = new Debugger(out);
        Objectify objectify = new Objectify(debug);
        Task solver = new Task();
        int test = 1;
        while(test-->0){
            solver.solve(1, in, out, debug, objectify);
        }
		out.close();
	}
}

class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;
 
    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }
 
    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }
 
    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public Double nextDouble() {
        return Double.parseDouble(next());
    }

    public float nextFloat() {
        return Float.parseFloat(next());
    }
 
}

class Debugger{
    PrintWriter out;

    Debugger(PrintWriter out){    
        this.out = out;
    }

    public <T> void printList(List<T> arrayList){
        for( Object ob: arrayList){
            out.print(ob+" ");
        }
        out.println();
    }

    public <T> void printSet(Set<T> set){
        for(Object ob: set){
            out.print(ob+" ");
        }
        out.println();
    }

    public <T> void printMap(Map<?,?> map){
        for(Object ob: map.keySet()){
            System.out.println(ob+" : "+map.get(ob));
        }
    }
}

class Objectify{
    
    Debugger debug;

    Objectify(Debugger ob){ debug = ob; }

    public void printArr(int[] arr){ debug.printList(Arrays.stream(arr).boxed().collect(Collectors.toList())); }
    public void printArr(double[] arr){ debug.printList(Arrays.stream(arr).boxed().collect(Collectors.toList())); }
    public void printArr(long[] arr){ debug.printList(Arrays.stream(arr).boxed().collect(Collectors.toList())); }
    public void printArr(char[] arr){ debug.printList( String.valueOf(arr).chars().mapToObj(c -> (char) c).collect(Collectors.toList())); }
    public void printArr(String[] arr){ debug.printList(Arrays.asList(arr)); }

    public void printMatrix(int[][] arr){ for(int a[]:arr) printArr(a); }
    public void printMatrix(double[][] arr){ for(double a[]:arr) printArr(a); }
    public void printMatrix(long[][] arr){ for(long a[]:arr) printArr(a); }
    public void printMatrix(char[][] arr){ for(char a[]:arr) printArr(a); }
    public void printMatrix(String[][] arr){ for(String a[]:arr) printArr(a); }

}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Template code ends here


class Task {

    final long MOD = (int)Math.pow(10,9)+7;
    int a[];
    int ans[];

    public int CeilIndex(List<Integer> A, int key) 
    {   
        if(A.get(0)>=key) return 0;

        int l =0, r = A.size();
        while (r - l > 1) { 
            int m = l + (r - l) / 2; 
            if (A.get(m) >= key) 
                r = m; 
            else
                l = m; 
        } 
  
        return r; 
    } 

    public void dfs(int node, Tree tree, List<Integer> subsequence, int parent){
        
        if (subsequence.size() == 0 || a[node] > subsequence.get(subsequence.size()-1)){
            subsequence.add(a[node]);
            ans[node] = subsequence.size();
            // System.out.println(node+" "+subsequence+" "+subsequence.size());
            for(int i : tree.edges.get(node)){
                if (i!=parent){
                    dfs(i, tree, subsequence, node);
                }
            }
            subsequence.remove(subsequence.size()-1);
        }else{
            int idx = CeilIndex(subsequence, a[node]);
            int backup = subsequence.get(idx);
            subsequence.set(idx, a[node]);
            ans[node] = subsequence.size();
            // System.out.println(node+" "+subsequence+" "+subsequence.size());
            for(int i : tree.edges.get(node)){
                if (i!=parent){
                    dfs(i, tree, subsequence, node);
                }
            }
            subsequence.set(idx, backup);
        }
    }

    public void solve(int testNumber, InputReader sc, PrintWriter out, Debugger debug, Objectify objectify) {
        
        // write your code here
        int n = sc.nextInt();

        Tree tree = new Tree(n);

        a = new int[n+1];
        ans = new int[n+1];
        a[0] = 0;
        ans[0] = 0;

        for(int i = 1; i <= n; ++i){
            a[i] = sc.nextInt();
            ans[i] = 0;
        }

        for(int i = 0; i < n-1; ++i){
            int u = sc.nextInt();
            int v = sc.nextInt();
            tree.add_edge(u, v);
        }

        List<Integer> subsequence = new ArrayList<>();
        // subsequence.add(a[1]);

        dfs(1, tree, subsequence, 0);

        for(int i = 1; i <= n; i++){
            out.println(ans[i]);
        }
    }

    class Tree{
        int v;
        Map<Integer, List<Integer>> edges;
        Tree(int v){
            this.v = v;
            edges = new HashMap<>();

            for(int i = 1; i <= this.v; i++){
                edges.put(i, new ArrayList<>());
            }

            edges.get(1).add(0);
        }

        void add_edge( int u, int v ){
            edges.get(u).add(v);
            edges.get(v).add(u);
        }
    }
}