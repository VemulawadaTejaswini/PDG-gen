
import java.util.*;
import java.io.*;
public class Main
{
	static LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
	static final int mod=(int)1e9+7;
	static final int inf=(int)1e9;
	static final long INF=(long)1e18;
	public static void main(String[] args)
	{
		FastScanner fs=new FastScanner();
		int n=fs.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=fs.next();
		}
		Arrays.parallelSort(arr);
//		System.out.println(Arrays.toString(arr));
		int c=0;
		int max=-inf;
		for(int i=0;i<=arr.length-2;i++)
		{
			if(arr[i].compareToIgnoreCase(arr[i+1])==0)
			{
				c++;
			}
			else
			{
				map.put(arr[i],c+1);
				max=Math.max(max,c+1);
				c=0;
			}
		}
		max=Math.max(max,c+1);
		map.put(arr[arr.length-1],c+1);
//		System.out.println(map);
		for(String key:map.keySet())
		{
			if(map.get(key)==max)
			{
				System.out.println(key);
			}
		}
	}
}
class FastScanner 
{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		public String next() 
		{
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
			
		}
		long pow(long x,long n)
		{
			long res=1;
			while(n>0)
			{
			   	if(n%2!=0)
			   	{
			   		res=(res*x);n--;
			   	}
			   	else
			   	{
			   		x=(x*x);n/=2;
			   	}
			}
			return res;
		}
		int gcd(int a,int b)
		{
			if(b==0)
			{
				return a;
			}
			return gcd(b,a%b);
		}
		long longgcd(long a,long b)
		{
			if(b==0)
			{
				return a;
			}
			return longgcd(b,a%b);
		}
		int[] sort(int arr[])
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i:arr)list.add(i);
			Collections.sort(list);
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=list.get(i);
			}
			return arr;
		}
		char[] charsort(char arr[])
	        {
	    	ArrayList<Character> list = new ArrayList<>();
	    	for(char c:arr)list.add(c);
	    	Collections.sort(list);
	    	for(int i=0;i<list.size();i++)
	    	{
	    		arr[i]=list.get(i);
	    	}
	    	return arr;
	        }
		
		long[] longsort(long arr[])
		{
			ArrayList<Long> list = new ArrayList<Long>();
			for(long i:arr)list.add(i);
			Collections.sort(list);
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=list.get(i);
			}
			return arr;
		}
		public int nextInt() 
		{
			return Integer.parseInt(next());
		}
		public int[] readArray(int n)
		{
			int[] arr=new int[n];
			for (int i=0; i<n; i++) arr[i]=nextInt();
			return arr;
		}	
		public long nextLong()
		{
			return Long.parseLong(next());
		}
		public long[] longreadArray(int n) 
		{
			long[] a=new long[n];
			for (int i=0; i<n; i++) a[i]=nextLong();
			return a;
		}
}