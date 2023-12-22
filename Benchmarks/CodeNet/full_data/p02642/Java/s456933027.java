// created on : Sun Jun 14 2020
 
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int n = in.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int num = in.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        outer:
        for(int num: map.keySet()){
            if(map.get(num) == 1){
                List<Integer> div = divisors(num);
                for(int d: div){
                    if(d != num){
                        if(map.containsKey(d)){
                            continue outer;
                        }
                    }
                }
                ans++;
            }
        }
        println(ans);
        in.close();
        out.close();
    }

    public static ArrayList<Integer> divisors(int n){
        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 1; i*i <= n; i++){
            if(n % i == 0){
                if(i == n/i){
                    A.add(i); 
                }
                else{
                    A.add(i);
                    A.add(n/i);
                }
            }
        }
        return A;
    } 

    static int MIN = Integer.MIN_VALUE;
    static int MAX = Integer.MAX_VALUE;
    static Reader in = new Reader();
    static PrintWriter out = new PrintWriter(System.out);

    static int[] readInt(int N) throws IOException { 
    	int arr[] = new int[N];
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.nextInt(); 
    	} 
    	return arr;
    }
    
    static long[] readLong(int N) throws IOException { 
    	long arr[] = new long[N];
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.nextLong(); 
    	} 
    	return arr;
    }
    
    static void print(Object O) {  
    	out.print(O); 
    }
    
    static void println(Object O) { 
    	out.println(O); 
    }
    
    static void println(int arr[]) { 
    	for(int i = 0; i < arr.length; i++){ 
    		print(arr[i] + " "); 
    	} 
    	println(""); 
    }
    
    static void displayRuntime(long startTime){
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Runtime: " + elapsedTime / 1000D);
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
