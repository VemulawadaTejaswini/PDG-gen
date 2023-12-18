/*
 * Remember a 7.0 student can know more than a 10.0 student.
 * Grades don't determine intelligence, they test obedience. 
 * I Never Give Up.
 */
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

import static java.lang.System.out;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class ContestMain {
	private static Reader in=new Reader();
	private static StringBuilder ans=new StringBuilder();
	private static long MOD=1000000007;//10^9+7 
	private static final int N=1000000;//10^6
	private static final int LIM=26;
//	private static final double PI=3.1415;
//	private static ArrayList<Integer> v[]=new ArrayList[N];
//	private static int color[]=new int[N]; //For Graph Coloring
//	private static boolean mark[]=new boolean[N];
//	private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//	private static void dfs(int node){mark[node]=true;for(int x:v[node]){if(!mark[x]){dfs(x);}}}
	private static long powmod(long x,long n,long m){
		if(n==0)return 1;
		else if(n%2==0)return(powmod((x*x)%m,n/2,m));
		else return (x*(powmod((x*x)%m,(n-1)/2,m)))%m;
	}
//	private static void shuffle(String[] arr) {
//		for (int i = arr.length - 1; i >= 2; i--) {
//			int x = new Random().nextInt(i - 1);
//	        String temp = arr[x];
//	        arr[x] = arr[i];
//	        arr[i] = temp;
//	    }
//	 }
	//OJ Doing = Codeforces
	//Double check the code
	public static void main(String[] args) throws IOException{
		int d=in.nextInt();
		int n=in.nextInt();
		if(d==0)out.println(1+(n-1)*1);
		else if(d==1)out.println(100+(n-1)*100);
		else out.println(10000+(n-1)*10000);
	}
	static class Pair implements Comparable<Pair>{
		long l;
		long r;
		Pair(){
			l=0;
			r=0;
		}
		Pair(long k,long v){
			l=k;
			r=v;
		}
		@Override
		public int compareTo(Pair o) {
			if(l!=o.l)return (int) (l-o.l);
			else return (int) -(r-o.r);  //changed
		}
		
	}
	static class Reader{
        BufferedReader br;
        StringTokenizer st;
        public Reader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}         