import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        FastReader fs=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        int t=1;
        //t=fs.nextInt();
        while(t-->0){
            solve(out,fs);
        }
        out.close();
    }
    public static void solve(PrintWriter out,FastReader fs){
        char s[]=fs.nextCharArray();
        int ans=0,count=0,n=s.length;
        for(int i=0;i<n;i++){
            if(s[i]=='R'){
                count++;
            }else{
                count=0;
            }
            ans=Integer.max(count,ans);
        }
        out.println(ans);
    }
}
class FastReader{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer("");
    String next(){
        while(!st.hasMoreTokens()){
            try {
                st=new StringTokenizer(br.readLine());
            } catch (IOException e) {
				e.printStackTrace();
			}
        }
        return st.nextToken();
    }
    int nextInt(){
        return Integer.parseInt(next());
    }
    long nextLong(){
        return Long.parseLong(next());
    }
    int[] nextIntArray(int n){
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=nextInt();
        return a;
    }
    long[] nextLongArray(int n){
        long a[]=new long[n];
        for(int i=0;i<n;i++)a[i]=nextInt();
        return a;
    }
    char[] nextCharArray(){
        char a[]=next().toCharArray();
        return a;
    }
}