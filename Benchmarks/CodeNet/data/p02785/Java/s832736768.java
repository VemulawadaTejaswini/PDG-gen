import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    
}
	static class SegmentTree {
        public int[] seg;
        public int N;
        public int size;

        public SegmentTree(int n) {
            
        	int h = (int)Math.ceil((double)Math.log(n)/Math.log(2));
        	
        	this.size = (int)Math.pow(2,h)*2-1;
        	seg = new int[size];
        }



        public int update(int l, int r, int i, int val) {
        	
        	
        	if(l == r && l == val)
        	{
        		seg[i]++;
        		return seg[i];
        	}
        	if(l > r || l == r || val > r || val < l) return seg[i];
            int m = (l+r) >>> 1;
            
            int left = update(l,m,2*i+1,val);
            
            int right = update(m+1,r,2*i+2,val);
            
            seg[i] = left+right;
            return seg[i];
        }

        

        public int getValue(int l, int r, int i, int ql, int qr) {
        	
            if (l > r || ql > qr || l > qr || r < ql) return 0;
            if (l == r) {
                return seg[i];
            }
            if (l >= ql && r <= qr) {
                return seg[i];
            }
            int m = (l + r) >>> 1;
            return getValue(l, m, 2 * i + 1, ql, qr) + getValue(m + 1, r, 2 * i + 2, ql, qr);
        }

    }
	
	public static int gcd(int a,int b)
	{
		if(a == 0) return b;
		if(b == 0) return a;
		
		return gcd(b, a%b);
	}
	
	
	
	public static void main(String[] args) 
	{
		OutputStream outputStream = System.out;
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        Integer h[] = new Integer[n];
        
        for(int i = 0; i < n; i++)
        {
        	h[i] = sc.nextInt();
        }
        Arrays.sort(h,Collections.reverseOrder());
        
        long ans = 0L;
        for(int i = k; i < n; i++)
        {
        	ans += h[i];
        }
        out.println(ans);
        out.close();
	}

}
