import java.io.*;
import java.util.*;
/*
 * 	Heart beats fast
 * 		Colors and promises
 * 			How to be brave
 * 				How can I love when I am afraid to fall...
 */
public class Main {
	static boolean bpm(boolean bpGraph[][], int u, boolean seen[],
	        int matchR[])
	{
	// Try every job one by one
	for (int v = 0; v < N; v++)
	{
	    // If applicant u is interested in job v and v
	    // is not visited
	    if (bpGraph[u][v] && !seen[v])
	    {
	        seen[v] = true; // Mark v as visited
	
	        // If job 'v' is not assigned to an applicant OR
	        // previously assigned applicant for job v (which
	        // is matchR[v]) has an alternate job available.
	        // Since v is marked as visited in the above line,
	        // matchR[v] in the following recursive call will
	        // not get job 'v' again
	        if (matchR[v] < 0 || bpm(bpGraph, matchR[v],
	                                 seen, matchR))
	        {
	            matchR[v] = u;
	            return true;
	        }
	    }
	}
	return false;
	}
	static int N,M;
	static // Returns maximum number of matching from M to N
			int maxBPM(boolean bpGraph[][])
	{
	// An array to keep track of the applicants assigned to
	// jobs. The value of matchR[i] is the applicant number
	// assigned to job i, the value -1 indicates nobody is
	// assigned.
	int matchR[] = new int[N];
	
	// Initially all jobs are available
	for(int i=0; i<N; ++i)
	    matchR[i] = -1;
	
	int result = 0; // Count of jobs assigned to applicants
	for (int u = 0; u < M; u++)
	{
	    // Mark all jobs as not seen for next applicant.
	    boolean seen[] =new boolean[N] ;
	    for(int i=0; i<N; ++i)
	        seen[i] = false;
	
	    // Find if the applicant 'u' can get a job
	    if (bpm(bpGraph, u, seen, matchR))
	        result++;
	}
	return result;
	}
	static final long mod=1000000007;
	static final double eps=1e-8;
	static final boolean debug=false;
	static Reader in=new Reader();
	public static void main(String[] args) throws IOException
	{
		int n=ni();
		N=n;
		M=n;
		int a[][]=new int[n][2];
		int b[][]=new int[n][2];
		for(int i=0; i<n; i++)
		{
			a[i][0]=ni();
			a[i][1]=ni();
		}
		for(int i=0; i<n; i++)
		{
			b[i][0]=ni();
			b[i][1]=ni();
		}
		int an=0;
		boolean bip[][]=new boolean[n][n];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(a[i][0]<b[j][0]&&a[i][1]<b[j][1])
				{
					bip[i][j]=true;
				}
			}
		}
		
		pr(maxBPM(bip));
		System.out.println(ans);
	}
	static StringBuilder ans=new StringBuilder();
	static long powm(long a, long b, long m)
	{
		long an=1;
		long c=a;
		while(b>0)
		{
			if(b%2==1)
				an=(an*c)%m;
			c=(c*c)%m;
			b>>=1;
		}
		return an;
	}
	static void pd(){if(debug)ans.append("hola");}
	static void pd(Object a){if(debug)ans.append(a+"\n");}
	static void pr(Object a){ans.append(a+"\n");}
	static void pr(){ans.append("\n");}
	static void p(Object a){ans.append(a);}
	static int ni(){return in.nextInt();}
	static long nl(){return in.nextLong();}
	static String ns(){return in.next();}
	static double nd(){return in.nextDouble();}
	static String pr(String a, long b)
	{
		String c="";
		while(b>0)
		{
			if(b%2==1)
				c=c.concat(a);
			a=a.concat(a);
			b>>=1;
		}
		return c;
	}
	static class Reader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public Reader() {
            reader = new BufferedReader(new InputStreamReader(System.in), 32768);
            tokenizer = null;
        }
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
        	return Long.parseLong(next());
        }
        public double nextDouble() {
        	return Double.parseDouble(next());
        }
    }
}