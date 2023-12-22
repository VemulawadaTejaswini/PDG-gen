import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        FastReader in = new FastReader();
        test a=new test();
        a.solve(in,out);
        out.close();
    }
}
class test{
    public void solve(FastReader in, PrintWriter out){
       int n=in.nextInt();
       int m=in.nextInt();
       int a[]=new int [n];
       for(int i=0;i<n;i++){
           a[i]=in.nextInt();
       }
       int v []=new int [n];
       Arrays.fill(v,1);
       for(int i=0;i<m;i++){
           int c=in.nextInt();
           int d=in.nextInt();
           c--;
           d--;
           if(a[c]>=a[d]){
               v[d]=0;
           }
           if(a[d]>=a[c]){
               v[c]=0;
           }
       }
       int s=0;
       for(int i=0;i<n;i++){
           s+=v[i];
       }
       out.println(s);
    }
    public long bits(long number){
        return (long)(Math.log(number)/Math.log(2) + 1);
    }
    public String create(long m){
        String s="";
        for(long i=0;i<m;i++){
            s+="1";
        }
        return s;
    }
}

class FastReader{
    BufferedReader br;
    StringTokenizer st;

    public FastReader(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next(){
        while(st==null || !st.hasMoreElements()){
            try{
                st=new StringTokenizer(br.readLine());
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt(){
        return Integer.parseInt(next());
    }

    Long nextLong(){
        return Long.parseLong(next());
    }

    double nextDouble(){
        return Double.parseDouble(next());
    }
    String nextLine(){
        String str="";
        try{
            str=br.readLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return str;
    }
}

