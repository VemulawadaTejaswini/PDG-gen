import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.StringTokenizer;



public class Main{
	
	static class FastReader 
    { 
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
	
	static class Pair
	{
		int x;
		int y;
		Pair(int x,int y)
		{
			this.x = x;
			this.y = y;
		}
		
	    @Override
	    public int hashCode() {
	        return (this.x ^ this.y);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Pair other = (Pair) obj;
	        if (x != other.x)
	            return false;
	        if (y != other.y)
	            return false;
	        return true;
	    }
	}
	
	static class Edge
	{
		int x;
		int y;
		Edge(int x,int y)
		{
			this.x = x;
			this.y = y;
		}
	}
	
	static class Compare { 
		  
	    static void compare(Pair arr[]) 
	    { 
	        // Comparator to sort the pair according to second element 
	        Arrays.sort(arr, new Comparator<Pair>() { 
	            @Override public int compare(Pair p1, Pair p2) 
	            { 	
	            	if(p1.y != p2.y)
	                return p1.y - p2.y; 
	            	
	            	else
	            	return p2.x-p1.x;
	            } 
	        }); 
	  
	       
	    } 
	} 
	
	public static int topDown(int ind,int rem)
	{
		if(ind == n || rem < 0)
		{
			return 0;
		}
		//System.out.println(ind+" "+rem);
		if(dp[ind][rem] > 0) return dp[ind][rem];
		
		int ans= 0;
		
		ans = Math.max(ans,pr[ind].y+topDown(ind+1,rem-pr[ind].x));
		
		ans = Math.max(ans,topDown(ind+1,rem));
		
		dp[ind][rem] = ans;
		return ans;
	}
	
	static Pair pr[];
	static int n,t;
	static int dp[][];
	public static void main(String[] args) 
	{
		OutputStream outputStream = System.out;
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
        
        n = sc.nextInt();
        t = sc.nextInt();
        
        pr = new Pair[n];
        
        for(int i = 0; i < n; i++)
        {
        	pr[i] = new Pair(0,0);
        	pr[i].x = sc.nextInt();
        	pr[i].y = sc.nextInt();
        }
        
        dp = new int[n][t+1];
        
        int ans = topDown(0,t);
        out.println(ans);
        
        out.close();
	}

}
