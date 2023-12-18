import java.io.*;
import java.util.*;
public class Main{
    static ArrayList<Integer>[] list;
    static int[] parent;
    static int[] c;
    
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader(); 
        int N, Q; {int[] a = r.ii(); N = a[0]; Q = a[1];}
        c = new int[N+1];        
        parent = new int[N+1];
        list = new ArrayList[N+1];
        for(int i = 1; i <= N; i++)
            list[i] = new ArrayList<>();
            
        for(int i = 0; i < N-1; i++){
            int[] tmp = r.ii();
            int a = tmp[0];
            int b = tmp[1];
            list[a].add(b);
            list[b].add(a);
        }
        
        for(int i = 0; i < Q; i++){
            int[] tmp = r.ii();
            int p = tmp[0];
            int x = tmp[1];
            c[p] += x;
        }
        
        deleteRoot(1);

        StringBuilder sb = new StringBuilder();
        solve(1);
        for(int i = 1; i <= N; i++)
            sb.append(c[i]).append(" ");
        println(sb);
    }
    static void deleteRoot(int root){
        ArrayList<Integer> al = list[root];
        for(int i : al){            
            parent[i] = root;
            list[i].remove(new Integer(root));      
            deleteRoot(i);
        }
    }
    static void solve(int root){
        for(int i : list[root])
            c[i] += c[parent[i]];
        for(int i : list[root])
            solve(i);        
    }
    static void print(Object o){
        System.out.print(o.toString());
    }
    static void println(Object o){
        System.out.println(o.toString());
    }
    static int Int(String s){
        return Integer.parseInt(s);
    }
    static long Long(String s){
        return Long.parseLong(s);
    }
    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return s().split(" ");
        }
        int i() throws IOException{
            return Int(s());
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }
        long l() throws IOException{
            return Long(s());
        }
        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long.parseLong(ss[j]);            
            return ll;
        }
    }
}