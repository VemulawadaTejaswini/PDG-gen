
// Submitted by Subhash Yadav
import java.io.*;
import java.util.*;



public class Main {
	

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out=new PrintWriter(System.out);
		
		int n=sc.nextInt(),k=sc.nextInt();
		int p[]=new int[n];
		for(int i=0;i<n;i++) p[i]=sc.nextInt()-1;
		
		int c[]=sc.readArray(n);
		
		ArrayList<Long>[] pre=new ArrayList[n];
		
		for(int i=0;i<n;i++) {
			pre[i]=new ArrayList<>();
			long sum=0;
			boolean visited[]=new boolean[n];
			int x=p[i];
			while(!visited[x]) {
				visited[x]=true;
				
				sum+=c[x];
				x=p[x];
				pre[i].add(sum);
			}
			
		}
		
		long ans=Long.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(k<=pre[i].size()) {
				for(int j=0;j<k;j++) ans=Math.max(ans, pre[i].get(j));
				
			}
			else {
				long tempmax=Long.MIN_VALUE;
				long last=pre[i].get(pre[i].size()-1);
				int k1=k%pre[i].size();
			
				long maxUptoK=Long.MIN_VALUE,wholeMax=Long.MIN_VALUE;
				for(int j=0;j<pre[i].size();j++) {
					if(j<k1) maxUptoK=Math.max(maxUptoK, pre[i].get(j));
					
					wholeMax=Math.max(wholeMax, pre[i].get(j));
				}
				int div=k/pre[i].size();
				
				if(last!=-1) {
					tempmax=Math.max(div*last+maxUptoK, (div-1)*last+wholeMax);
				}
				else {
					tempmax=Math.max(tempmax, wholeMax);
				}
				ans=Math.max(ans, tempmax);
				
			}
			
			
		}
		System.out.println(ans);
		
	
		
		

	}

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}