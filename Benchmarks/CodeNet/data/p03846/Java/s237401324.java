import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] args) throws IOException {
        int N = in.nextInt();
        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i < N; i++){
            int a = in.nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int mod = (int) 1e9 + 7;
        boolean flag = true;
        if(N % 2 == 0){
            // all keys should be odd with count 2
            for(int a: map.keySet()){
                if(a % 2 == 0 ||  map.get(a) != 2){
                    flag = false;
                    break;
                }
            }
        }
        else{
            // all keys should be even with count 2 except 0
            for(int a: map.keySet()){
                if(a == 0){
                    if(map.get(a) != 1){
                        flag = false;
                        break;
                    }
                }
                else if(a % 2 == 1 || map.get(a) != 2){
                    flag = false;
                    break;
                }
            }
        }

        if(flag){
            long ans = powerMOD(2, N/2, mod);
            println(ans);
        }
        else{
            println(0);
        }
        
        in.close();
        out.close();
    }


    public static long powerMOD(long a, int n, int mod){
        long res = a;
        while(n-->1){
            res = res*a;
            res = res % mod;
        }

        return res;
    }

    static int MIN = Integer.MIN_VALUE;
    static int MAX = Integer.MAX_VALUE;
    static Reader in = new Reader();
    static PrintWriter out = new PrintWriter(System.out);
    static void read(int arr[], int N) throws IOException{ for(int i = 0; i < N; i++){ arr[i] = in.nextInt(); } }
    static void read(long arr[], int N) throws IOException{ for(int i = 0; i < N; i++){ arr[i] = in.nextLong(); } }
    static void read(String arr[], int N) throws IOException{ for(int i = 0; i < N; i++){ arr[i] = in.next(); } }
    static void print(Object O){ out.print(O); }
    static void println(Object O){ out.println(O); }
    static void print(int arr[]){ for(int i = 0; i < arr.length; i++){ print(arr[i]+" "); } println(""); }
    static void print(int arr[][]){ for(int i = 0; i < arr.length; i++){ print(arr[i]); } }
    static void debug(Object O){ System.out.println(O); }
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