import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main 
{
	static class Node
	{
		int a, b;
		boolean rooty = true;
		HashSet<Node> e = new HashSet<>();
		int cache=-100;
		
		public Node(int a0, int b0)
		{
			a = a0;
			b = b0;
		}
		
		int visrun = -1;
	}

	static int n;
	static Node[][] nd;
	static int run = 0;
	static int abortrun = -1;
	
	static int maxh(Node pos)
	{
//		System.out.println("Traverse " + pos.a + " " + pos.b);
		if(pos.cache >= 0)return pos.cache;
		
//		System.out.println("go to " + pos.a + " " + pos.b);
		if(abortrun >= run)return -1;
		pos.visrun = run;
		int ma = 1;
		for(Node e : pos.e)
		{
			if(e.visrun == run)
			{
				abortrun = run;
				return -1;
			}
			ma = Math.max(ma, 1 + maxh(e));
		}
		pos.cache = ma;
		pos.visrun = -1;
		return ma;
	}
	
	public static void main(String[] args) 
	{
		FastReader sc = new FastReader();
		n = sc.nextInt();
		nd = new Node[n][n];
		for(int i = 0; i < n; i++)
			for(int j = i+1; j < n; j++)
			{
				nd[i][j] = new Node(i,j);
			}
		
		for(int i = 0; i < n; i++)
		{
			Node prev = null;
			for(int j = 0; j < n-1; j++)
			{
				int b0 = sc.nextInt()-1;
				int a = Math.min(i, b0);
				int b = Math.max(i, b0);
				Node curn = nd[a][b];
				
				if(prev != null)
				{
					prev.e.add(curn);
					curn.rooty = false;
				}
				prev = curn;
			}
		}
		
		HashSet<Node> roots = new HashSet<>();
		for(int i = 0; i < n; i++)
			for(int j = i+1; j < n; j++)
			{
				if(nd[i][j].rooty)roots.add(nd[i][j]);
			}
		
		if(roots.size() <= 0)
		{
			System.out.println(-1);
			return;
		}
		
		int max = 0;
		for(Node r : roots)
		{
//			System.out.println("start from " + r.a + " " + r.b);
			run++;
			max = Math.max(max, maxh(r));
			if(abortrun >= run)
			{
//				System.out.println("CYC");
				System.out.println(-1);
				return;
			}
		}
		System.out.println(max);
		
	}

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
}
