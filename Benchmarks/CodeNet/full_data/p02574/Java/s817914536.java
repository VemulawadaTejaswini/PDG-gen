import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args)
	{
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		MyScanner in = new MyScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		E solver = new E();
		solver.solve(1, in, out);
		out.close();
	}
	
	static class E
	{
		public void solve(int testnum, MyScanner in, PrintWriter out)
		{
			int n = in.nextInt();
			int[] a = new int[n];
			int[] primes = primeArray(1000000);

			String ans = "not coprime";

			for( int i=0; i<n; i++ )
			{
				a[i] = in.nextInt();
			}

			if( pairwise(primes, a) )
			{
				ans = "pairwise coprime";
			}
			else if( setwise(primes, a) )
			{
				ans = "setwise coprime";
			}
			else
			{
				ans = "not coprime";
			}
			out.println(ans);
		}
		
		boolean setwise(int[] primes, int[] X)
		{
			boolean[] flags = new boolean[primes.length];
			for( int i=0; i<flags.length; i++ )
			{
				flags[i] = true;
			}
			
			for( int x : X )
			{
				for( int i=0; i<primes.length; i++ )
				{
					int p = primes[i];
					boolean factrized = false;
				
					while( x%p == 0 )
					{
						x /= p;
						factrized = true;
					}
					flags[i] &= factrized;
				}
			}
			
			for( boolean flag : flags )
			{
				if( flag ) return false;
			}
			return true;
		}
		
		boolean pairwise(int[] primes, int[] X)
		{
			boolean[] flags = new boolean[primes.length];
			for( int i=0; i<flags.length; i++ )
			{
				flags[i] = false;
			}
			for( int x : X )
			{
				for( int i=0; i<primes.length; i++ )
				{
					int p = primes[i];
					boolean factrized = false;
					
					while( x%p == 0 )
					{
						x /= p;
						factrized = true;
					}
					
					if( factrized )
					{
						if( flags[i] )
						{
							return false;
						}
						else
						{
							flags[i] = true;
						}
					}
				}
			}
			return true;
		}
		
		int gcd(int a, int b)
		{
			if( a == 0 )
			{
				return b;
			}
			else
			{
				return gcd(b%a, a);
			}
		}
		
		int[] primeArray(int max)
		{
			boolean[] isPrime = new boolean[max+1];
			int[] primes = new int[max+1];
			int cnt = 0;
			for( int i=0; i<=max; i++ )
			{
				isPrime[i] = true;
			}

			for( int i=2; i<=max; i++ )
			{
				if( isPrime[i] )
				{
					primes[cnt++] = i;
					for( int j=2*i; j<=max; j+=i )
					{
						isPrime[j] = false;
					}
				}
			}
			return Arrays.copyOf(primes, cnt);
		}
	}
	
	
	static class D
	{
		public void solve(int n, MyScanner in, PrintWriter out)
		{
			int N = in.nextInt();
			int M = in.nextInt();
			UnionFind tree = new UnionFind(N);
			for( int i=0; i<M; i++ )
			{
				int a = in.nextInt();
				int b = in.nextInt();
				tree.unite(a-1, b-1);
			}
			out.println(tree.max);
		}

		class UnionFind
		{
			int[] par;
			int[] n_nodes;
			int max = 1;
			
			public UnionFind(int n)
			{
				par = new int[n];
				n_nodes = new int[n];
				for( int i=0; i<n; i++ )
				{
					par[i] = i;
					n_nodes[i] = 1;
				}
			}
			
			int root(int x)
			{
				if( par[x] == x ) return x;
				return par[x] = root(par[x]);
			}
			
			void unite(int x, int y)
			{
				int rx = root(x);
				int ry = root(y);
				if( rx == ry ) return;
				par[rx] = ry;
				n_nodes[ry] += n_nodes[rx];
				max = Math.max(max, n_nodes[ry]);
			}
			
			boolean same(int x, int y)
			{
				int rx = root(x);
				int ry = root(y);
				return rx == ry;
			}
		}
	}
	
	static class C
	{
		public void solve(int n, MyScanner in, PrintWriter out)
		{
			int mod = (int) 1e9 + 7;
			
			int N = in.nextInt();
			int[] a = new int[N];
			long sum = 0;
			for( int i=0; i<N; i++ )
			{
				a[i] = in.nextInt();
				sum += a[i];
			}
			long ans = 0;
			for( int i=0; i<N; i++ )
			{
				sum -= a[i];
				long add = ((sum % mod) * a[i]) % mod;
				ans = (ans + add) % mod;
			}
			out.println(ans);
		}
	}
	
	static class B
	{
		public void solve(int n, MyScanner in, PrintWriter out)
		{
			String S = in.next();
			String T = in.next();

			char[] s = S.toCharArray();
			char[] t = T.toCharArray();
			
			int min = t.length;
			for( int i=0; i<=s.length - t.length; i++ )
			{
				int cnt = 0;
				for( int j=0; j<t.length; j++ )
				{
					if( s[i+j] != t[j] ) cnt++;
				}
				min = Math.min(min, cnt);
			}
			out.println(min);
		}
	}
	
	static class A
	{
		int D;
		int T;
		int S;
		
		public void solve(int testNumber, MyScanner in, PrintWriter out)
		{
			D = in.nextInt();
			T = in.nextInt();
			S = in.nextInt();
			out.println(D <= T*S ? "Yes" : "No");
		}
	}
	
	static class MyScanner
	{
		private BufferedReader in;
		private StringTokenizer st;
		
		public MyScanner(InputStream stream)
		{
			in = new BufferedReader(new InputStreamReader(stream));
		}
		
		public String next()
		{
			while( st == null || !st.hasMoreTokens() )
			{
				try
				{
					String rl = in.readLine();
					if( rl == null )
					{
						return null;
					}
					st = new StringTokenizer(rl);
				}
				catch( IOException e )
				{
					return null;
				}
			}
			return st.nextToken();
		}
		
		public int nextInt()
		{
			return Integer.parseInt(next());
		}
	}
}
