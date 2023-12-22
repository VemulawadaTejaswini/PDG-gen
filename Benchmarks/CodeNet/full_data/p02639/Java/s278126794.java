import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
// Solution Starts here
public class Main{
    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int a[]=in.readArray(5);
        int c=0;
        for(int i=0;i<5;i++)
            if(a[i]==0)
                c=i;
                
        out.println(c+1);
        out.close();
    }
    // solution ends here
    static class FastScanner{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sr = new StringTokenizer("");
        String next(){
            while(!sr.hasMoreTokens()){
                try{
                    sr=new StringTokenizer(br.readLine());
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            return sr.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        int[] readArray(int n){
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=nextInt();
            return a;
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
    }

}