//https://atcoder.jp/contests/abc135/tasks/abc135_d
import java.util.*;
import java.io.*;
import java.math.*;

public class Main
{

    public static void process()throws IOException
    {
       	char arr[]=(" "+nln()).toCharArray();
       	int n=arr.length-1; 
       	long dp[][]=new long[n+2][14];

       	if(arr[1]=='?'){
       		for(int j=0;j<10;j++)
       			dp[1][j]=1;
       	}
       	else
       		dp[1][arr[1]-'0']=1;

       	for(int i=2;i<=n;i++){
       		char curr=arr[i];

       		if(curr=='?'){
       			for(int j=0;j<13;j++){
       				for(int k=0;k<10;k++){
       					int rem=10*j+k;rem%=13;
       					dp[i][rem]+=dp[i-1][j];
       					dp[i][rem]%=mod;
       				}
       			}
       		}
       		else{
       			int x=curr-'0';
       			for(int j=0;j<13;j++){
       				int rem=10*j+x;rem%=13;
       				dp[i][rem]+=dp[i-1][j];
       				dp[i][rem]%=mod;
       			}
       		}
       	}
       	pn(dp[n][5]);
    }


    static FastReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        out = new PrintWriter(System.out);
        sc=new FastReader();

        long s = System.currentTimeMillis();
        int t=1;
        //t=ni();
        while(t-->0)
            process();

        out.flush();
        System.err.println(System.currentTimeMillis()-s+"ms");
    }
    
    
    static void pn(Object o){out.println(o);}
    static void p(Object o){out.print(o);}
    static int ni()throws IOException{return Integer.parseInt(sc.next());}
    static long nl()throws IOException{return Long.parseLong(sc.next());}
    static double nd()throws IOException{return Double.parseDouble(sc.next());}
    static String nln()throws IOException{return sc.nextLine();}
    static long gcd(long a, long b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int gcd(int a, int b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int bit(long n)throws IOException{return (n==0)?0:(1+bit(n&(n-1)));}
    
    static long mod=(long)1e9+7l;

    static<T> void r_sort(T arr[],int n){
        Random r = new Random(); 
        for (int i = n-1; i > 0; i--){ 
            int j = r.nextInt(i+1); 
                  
            T temp = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] = temp; 
        } 
        Arrays.sort(arr); 
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 
    } 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
}