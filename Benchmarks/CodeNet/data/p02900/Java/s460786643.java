import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	static class FastReader { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
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
	public static List<Integer>[] edges;
	public static long[] fac,inv;
	public static int mod = (int) (1e9+7),MAX = (int) (1e5+1);
	public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
	
		long a = sc.nextLong();
		long b = sc.nextLong();
		List<Long> diva = getdiv(a);
		List<Long> divb = getdiv(b);
		Set<Long> set = new HashSet<>(diva);
		long ans = 1;
		for(int i=0;i<divb.size();++i) {
			long x = divb.get(i);
			if(set.contains(x)) {
				if(BigInteger.valueOf(x).isProbablePrime(20)) ++ans;
			}
		}
		out.print(ans);
        out.close();
		
	}
	
	
	private static List<Long> getdiv(long n) {
		List<Long> ans = new ArrayList<>();
		long root = (long) Math.sqrt(n);
		for(long i=1;i<=root;++i) {
			if(n%i == 0) {
				if(i != n/i) ans.add(n/i);
				ans.add(i);
			}
		}
		return ans;
	}


	static class Pair implements Comparable<Pair>{
		int u;
		int v;
		int c;
		Pair(int u,int v){
			this.u = u;
			this.v = v;
		}
		@Override
		public int compareTo(Pair arg0) {
			// TODO Auto-generated method stub
			return this.u - arg0.u;
		}
	}
	
}
