import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
 
import static java.lang.Math.*;

public class Main implements Runnable 
{
	static class InputReader 
	{
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;
		private SpaceCharFilter filter;
		private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		public InputReader(InputStream stream) 
		{
			this.stream = stream;
		}
		
		public int read()
		{
			if (numChars==-1) 
				throw new InputMismatchException();
            
			if (curChar >= numChars) 
			{
				curChar = 0;
				try
				{
					numChars = stream.read(buf);
				}
				catch (IOException e)
				{
					throw new InputMismatchException();
				}
                
				if(numChars <= 0)               
					return -1;
			}
			return buf[curChar++];
		}
     
		public String nextLine()
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
		public int[] nextArray(int n)
		{
			int arr[] = new int[n];
			int i;
			for(i=0;i<n;i++)
			{
				arr[i] = nextInt();
			}
			return arr;
		}
		public int nextInt() 
		{
			int c = read();
            
			while(isSpaceChar(c)) 
				c = read();
		
			int sgn = 1;
        
			if (c == '-') 
			{
				sgn = -1;
				c = read();
			}
            
			int res = 0;
			do
			{
				if(c<'0'||c>'9') 
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}
			while (!isSpaceChar(c)); 
        
			return res * sgn;
		}
        
		public long nextLong() 
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-')
			{
				sgn = -1;
				c = read();
			}
			long res = 0;
			
			do 
			{
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}	
			while (!isSpaceChar(c));
				return res * sgn;
		}
		
		public double nextDouble() 
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-')
			{
				sgn = -1;
				c = read();
			}
			double res = 0;
			while (!isSpaceChar(c) && c != '.') 
			{
				if (c == 'e' || c == 'E')
					return res * Math.pow(10, nextInt());
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			}
			if (c == '.') 
			{
				c = read();
				double m = 1;
				while (!isSpaceChar(c))
				{
					if (c == 'e' || c == 'E')
						return res * Math.pow(10, nextInt());
					if (c < '0' || c > '9')
						throw new InputMismatchException();
					m /= 10;
					res += (c - '0') * m;
					c = read();
				}
			}
			return res * sgn;
		}
    
		public String readString() 
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do 
			{
				res.appendCodePoint(c);
				c = read();
			} 
			while (!isSpaceChar(c));
            
			return res.toString();
		}
     
		public boolean isSpaceChar(int c) 
		{
			if (filter != null)
				return filter.isSpaceChar(c);
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
     
		public String next()
		{
			return readString();
		}
        
		public interface SpaceCharFilter
		{
			public boolean isSpaceChar(int ch);
		}
		
		public int[] nextIntArray(int n)
		{
			int i;
			int arr[] = new int[n];
			for(i=0;i<n;i++)
			{
				arr[i] = nextInt();
			}
			return arr;
		}
		
		public long[] nextLongArray(int n)
		{
			int i;
			long arr[] = new long[n];
			for(i=0;i<n;i++)
			{
				arr[i] = nextLong();
			}
			return arr;
		}
		
		public double[] nextDoubleArray(int n)
		{
			int i;
			double arr[] = new double[n];
			for(i=0;i<n;i++)
			{
				arr[i] = nextDouble();
			}
			return arr;
		}
		
		public Integer[] IntegerArray(int n)
		{
			int i;
			Integer arr[] = new Integer[n];
			for(i=0;i<n;i++)
			{
				arr[i] = nextInt();
			}
			return arr;
		}
		
		public Long[] LongArray(int n)
		{
			int i;
			Long arr[] = new Long[n];
			for(i=0;i<n;i++)
			{
				arr[i] = nextLong();
			}
			return arr;
		}
		
		public Double[] DoubleArray(int n)
		{
			int i;
			Double arr[] = new Double[n];
			for(i=0;i<n;i++)
			{
				arr[i] = nextDouble();
			}
			return arr;
		}
		
		public ArrayList<ArrayList<Integer>> getGraph(int n,int m)
		{
			ArrayList<ArrayList<Integer>> g =new ArrayList<>();
			int i;
			for(i=0;i<=n;i++)
			{
				g.add(new ArrayList<>());
			}
			for(i=0;i<m;i++)
			{
				int x = nextInt();
				int y = nextInt();
				g.get(x).add(y);
				g.get(y).add(x);
			}
			return g;
		}
		
		public ArrayList<ArrayList<Integer>> getTree(int n)
		{
			ArrayList<ArrayList<Integer>> g =new ArrayList<>();
			int i;
			for(i=0;i<=n;i++)
			{
				g.add(new ArrayList<>());
			}
			for(i=0;i<n-1;i++)
			{
				int x = nextInt();
				int y = nextInt();
				g.get(x).add(y);
				g.get(y).add(x);
			}
			return g;
		}
	}
	
	public static int maxInt(int arr[])
	{
		int max = Integer.MIN_VALUE;
		for(int i : arr)
		{
			max = Math.max(i,max);
		}
		return max;
	}
	
	public static int minInt(int arr[])
	{
		int min = Integer.MAX_VALUE;
		for(int i : arr)
		{
			min = Math.min(i,min);
		}
		return min;
	}
	
	public static long maxLong(long arr[])
	{
		long max = Long.MIN_VALUE;
		for(long i : arr)
		{
			max = Math.max(i,max);
		}
		return max;
	}
	
	public static long minLong(long arr[])
	{
		long min = Long.MAX_VALUE;
		for(long i : arr)
		{
			min = Math.min(i,min);
		}
		return min;
	}
	
	public static double maxDouble(double arr[])
	{
		double max = Double.MIN_VALUE;
		for(double i : arr)
		{
			max = Math.max(i,max);
		}
		return max;
	}
	
	public static double minDouble(double arr[])
	{
		double min = Double.MAX_VALUE;
		for(double i : arr)
		{
			min = Math.min(i,min);
		}
		return min;
	}
	
	void merge(int arr[], int l, int m, int r) 
	{ 
		int n1 = m - l + 1; 
		int n2 = r - m; 
	  

		int L[] = new int [n1]; 
		int R[] = new int [n2]; 
	  

		for (int i=0; i<n1; ++i) 
		    L[i] = arr[l + i]; 
		for (int j=0; j<n2; ++j) 
		    R[j] = arr[m + 1+ j]; 
  
  
  

		int i = 0, j = 0; 
	  

		int k = l; 
		while (i < n1 && j < n2) 
		{ 
		    if (L[i] <= R[j]) 
		    { 
			arr[k] = L[i]; 
			i++; 
		    } 
		    else
		    { 
			arr[k] = R[j]; 
			j++; 
		    } 
		    k++; 
		} 

		while (i < n1) 
		{ 
		    arr[k] = L[i]; 
		    i++; 
		    k++; 
		} 
	  
   
		while (j < n2) 
		{ 
		    arr[k] = R[j]; 
		    j++; 
		    k++; 
		} 
	} 
  
    
	void sort(int arr[], int l, int r) 
	{ 
		if (l < r) 
		{ 
			int m = (l+r)/2; 
			sort(arr, l, m); 
			sort(arr , m+1, r); 
			merge(arr, l, m, r); 
		} 
	}
	
	static class Pair
	{
		int x,y;
		public Pair(int f,int s)
		{
			this.x = y;
			this.x = y;
		}
		public static Comparator<Pair> sortX = new Comparator<Pair>(){
			public int compare(Pair p1,Pair p2)
			{
				if(p1.x==p2.x)
				{
					return p1.y-p2.y;
				}
				return p1.x-p2.x;
			}
		};
		
		public static Comparator<Pair> sortY = new Comparator<Pair>(){
			public int compare(Pair p1,Pair p2)
			{
				if(p1.y==p2.y)
				{
					return p1.x-p2.x;
				}
				return p1.y-p2.y;
			}
		};
	}
	
	static class DSU
	{
		public static int rank[],parent[];
		int n;
		HashMap<Integer,Integer> map = new HashMap<>();
		
		public DSU(int n)
		{
			rank = new int[n+1];
			parent = new int[n+1];
			this.n = n;
			makeSet(n);
		}
		
		public void makeSet(int n)
		{
			for(int i=1;i<=n;i++)
			{
				parent[i] = i;
				map.put(i,1);
			}
		}
		
		public static int find(int x)
		{
			if(parent[x]!=x)
			{
				parent[x] = find(parent[x]);
			}
			return parent[x];
		}
		
		public void union(int x,int y)
		{
			int xRoot = find(x);
			int yRoot = find(y);
			
			if(xRoot==yRoot)
			{
				return;
			}
			
			if(rank[xRoot] < rank[yRoot])
			{
				parent[xRoot] = yRoot;
				map.put(yRoot,map.getOrDefault(yRoot,1)+map.getOrDefault(xRoot,1));
				if(map.getOrDefault(xRoot,0)!=0)
				{
					map.remove(xRoot);
				}
			}
			else if(rank[yRoot] < rank[xRoot])
			{
				parent[yRoot] = xRoot;
				map.put(xRoot,map.getOrDefault(xRoot,1) + map.getOrDefault(yRoot,1));
				if(map.getOrDefault(yRoot,0)!=0)
				{
					map.remove(yRoot);
				}
			}
			else
			{
				parent[yRoot] = xRoot;
				rank[xRoot] = rank[xRoot] + 1;
				map.put(xRoot,map.getOrDefault(xRoot,1)+map.getOrDefault(yRoot,1));
				if(map.getOrDefault(yRoot,0)!=0)
				{
					map.remove(yRoot);
				}
			}
		}
	}
	
	public static void main(String args[]) throws Exception 
	{
		new Thread(null, new Main(),"Main",1<<27).start();
	}	
		
	public void run()	
	{
		InputReader in = new InputReader(System.in);
		PrintWriter w = new PrintWriter(System.out);
		String s = new String();
		s = in.next();
		if(s.equals("ABC"))
		{
			s = "ARC";
		}
		else
		{
			s = "ABC";
		}
		w.println(s);
		w.flush();
		w.close();
	}
}
