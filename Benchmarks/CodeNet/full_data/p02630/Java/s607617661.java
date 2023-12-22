import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.charset.IllegalCharsetNameException;
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

class test {
    public void solve(FastReader in, PrintWriter out){
       int n=in.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
           a[i]=in.nextInt();
       }
       int q=in.nextInt();
       for(int i=0;i<q;i++){
           int b=in.nextInt();
           int c=in.nextInt();
           for(int j=0;j<n;j++){
               if(a[j]==b){
                   a[j]=c;
               }
           }
           out.println(sum(a));
       }
    }
    public long sum(int a[]){
        long sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
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