
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;


public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskT solver = new TaskT();
        solver.solve(1, in, out);
        out.close();
    }
    
    

    static class TaskT {
    	static int counter = 0;
        public void solve(int testNumber, InputReader in, PrintWriter out) {

        	int N = in.nextInt();
        	int M = in.nextInt();
        	
        	Map<Integer, Set<Integer>> map = new HashMap<>();
        	
        	for(int i = 0; i < M ; i ++){
        		int source = in.nextInt();
        		Set<Integer> source_set = map.getOrDefault(source, new HashSet<>());
        		int dest = in.nextInt();
        		source_set.add(dest);
        		map.put(source, source_set);
        		
        		Set<Integer> dest_set = map.getOrDefault(dest, new HashSet<>());
        		dest_set.add(source);
        		map.put(dest, dest_set);
        	}
        	
        	Set<Integer> visited = new HashSet<>();
        	int num_island = 0;
        	for(int key : map.keySet()){
        		if(!visited.contains(key)){
        			dfs(map, visited, key);
            		num_island++;
        		}

        	}
        	
        	out.print(num_island - 1 + N - map.size());
        }
        
        public void dfs (Map<Integer, Set<Integer>> map, Set<Integer> visited, int source){
        	
        	visited.add(source);

    		for(int dest : map.get(source)){
    			if(visited.contains(dest))
    				continue;
    			dfs(map, visited, dest);
    		}
        		

        }
        
        

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
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
    }
}
