///package CodeForce;

import java.util.*;
import java.io.*;
 class Main{

	public static boolean[] visit;
	static boolean[] b;
	static int[] FF;
	static int[] A;
	static int[][]graph;
	static int n;
	static int label;
	static int max;
	static LinkedHashMap<Long,Long> memo;
	public static void main(String[] ard)  throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		String s=br.readLine().trim();
		if(s.length()>=4)
		{
			if(s.charAt(0)=='Y'&&s.charAt(1)=='A'&&s.charAt(2)=='K'&&s.charAt(3)=='I')
				pw.println("Yes");
			else pw.println("No");
		}
		else pw.println("No");
		
		
	pw.close();
		
	}
	static  long sumDigit(long x)
	{
		long sum=0;
		while(x>0)
		{
			int r=(int) (x%10);
			sum+=r*r;
			x/=10;
		}
		return sum;
	}
	
	public static  long grundy(long a) {
	      if (a <= 2) return a;
	      boolean[] tmpArr = new boolean[35];
	      Long tmp = memo.get(a);
	      if (tmp != null) return tmp;
	      for (int j = 0; j < 35; j++) {
	          if (a < (1L << j)) break;
	          long next = ((1L << j) - 1) & a;
	          next |= a >>> (j + 1);
	          tmpArr[(int) grundy(next)] = true;
	      }
	      for (int j = 0; j < 35; j++) {
	          if (!tmpArr[j]) {
	              memo.put(a, (long) j);
	              return j;
	          }
	      }
	      return 0;
	  }
public class PrimeRoutines {
		
		int[] lowDivIdx;
		int[] lowDiv;
		int[] p;
		int N;
		
		public PrimeRoutines(int N) {
			this.N = N;
			p = new int[(int)(N / Math.log(N))];
			lowDivIdx = new int[N + 1];
			lowDiv = new int[N + 1];
			Arrays.fill(lowDivIdx, -1);
			int pCnt = 0;
			for (int i = 2; i <= N; i++) {
				if (lowDivIdx[i] == -1) {
					if (p.length == pCnt) {
						p = Arrays.copyOf(p, 2 * p.length);
					}
					lowDivIdx[i] = pCnt;
					lowDiv[i] = i;
					p[pCnt++] = i;	
				}
				int toJ = Math.min(pCnt, lowDivIdx[i] + 1);
				for (int j = 0; j < toJ; j++) {
					int x = i * p[j];
					if (x > N) {
						break;
					}
					lowDivIdx[x] = j;
					lowDiv[x] = p[j];
				}
			}
			p = Arrays.copyOf(p, pCnt); 
		}
		
		int[] divCount() {
			int[] ret = new int[N + 1];
			int[] tmp = new int[N + 1];
			ret[1] = 1;
			for (int i = 2; i <= N; i++) {
				int p = lowDiv[i];
				int j = i / p;
				if (p == lowDiv[j]) {
					int k = tmp[j];
					ret[i] = ret[j] / k * (k + 1);
					tmp[i] = k + 1;
				} else {
					ret[i] = ret[j] * 2;
					tmp[i] = 2;
				}
			}
			return ret;
		}
		
		List<Integer> getDivsNotSorted(int x) {
			List<Integer> ret = new ArrayList<Integer>(0);
			ret.add(1);
			while (x > 1) {
				int sz = ret.size();
				int pr = lowDiv[x];
				while (lowDiv[x] == pr) {
					int to = ret.size();
					for (int i = ret.size() - sz; i < to; i++) {
						ret.add(ret.get(i) * pr);
					}
					x /= pr;
				}
			}
			return ret;
		}

		int[] moebiusFunction() {
			int[] mu = new int[N + 1];
			mu[1] = 1;
			for (int i = 2; i <= N; i++) {
				int p = lowDiv[i];
				int j = i / p;
				if (p != lowDiv[j]) {
					mu[i] = -mu[j];
				}
			}
			return mu;
		}

		int[] eulerFunction() {
			int[] phi = new int[N + 1];
			phi[1] = 1;
			for (int i = 2; i <= N; i++) {
				int p = lowDiv[i];
				int j = i / p;
				phi[i] = phi[j] * (p != lowDiv[j] ? p - 1 : p);
			}
			return phi;
		}
	}

	
	public static void BFS(int start)
	{
		visit=new boolean[n];
		int[] d=new int[n];
		Arrays.fill(d,0);
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(start);
		while(!q.isEmpty())
		{
			int u=q.poll();
			for(int i=0;i<graph[u].length;i++)
			{
				if(!visit[graph[u][i]])
				{
					visit[graph[u][i]]=true;
					d[graph[u][i]]=d[u]+1;
					q.add(graph[u][i]);
				}
			}
			
		 }
		 label=0;
		 max=0;
		for(int i=0;i<n;i++)
			if(d[i]>max)
			{
				max=d[i];
				label=i;
			}
		
	
	}
	public static int[][] packU(int n, int[] from, int[] to, int max) {
	    
	    int[][] g = new int[n][];
	    int[] p = new int[n];
	    for (int i = 0; i < max; i++) p[from[i]]++;
	    for (int i = 0; i < max; i++) p[to[i]]++;
	    for (int i = 0; i < n; i++) g[i] = new int[p[i]];
	    for (int i = 0; i < max; i++) {
	        g[from[i]][--p[from[i]]] = to[i];
	        g[to[i]][--p[to[i]]] = from[i];
	    }
	    return g;
	}
	public static int[][] parents3(int[][] g, int root) {
        int n = g.length;
        int[] par = new int[n];
        Arrays.fill(par, -1);

        int[] depth = new int[n];
        depth[0] = 0;

        int[] q = new int[n];
        q[0] = root;
        for (int p = 0, r = 1; p < r; p++) {
            int cur = q[p];
            for (int nex : g[cur]) {
                if (par[cur] != nex) {
                    q[r++] = nex;
                    par[nex] = cur;
                    depth[nex] = depth[cur] + 1;
                }
            }
        }
        return new int[][]{par, q, depth};
    }

	public static int pow(int n,int p)
	{
		if(p==0)return 1;
		if(p==1)return n;
		int res=1;
		while(p!=0)
		{
			if(p%2!=0)res*=n;
			n*=n;
			p>>=1;
		}
		return res;
	}
	public static boolean[] Seive()
	{
		
		 b=new boolean[10000001];
		Arrays.fill(b, true);
		b[0]=false;
		b[1]=false;
		
		for(int i=2;i<=Math.sqrt(10000000);i++)
		{
			if(b[i])
			{
				
			 for(int j=i*2;j<=10000000;j+=i)
				{
					     b[j]=false;
					
				}
			}
			
		}
		return b;
	}
	public static class Merge {
		public void sort(int inputArr[]) {
	        int length = inputArr.length;
	        doMergeSort(inputArr,0, length - 1);
	    }
	    private void doMergeSort(int[] arr,int lowerIndex, int higherIndex) {         
	        if (lowerIndex < higherIndex) {
	            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
	            doMergeSort(arr,lowerIndex, middle);
	            doMergeSort(arr,middle + 1, higherIndex);
	            mergeParts(arr,lowerIndex, middle, higherIndex);
	        }
	    }
	    private void mergeParts(int[]array,int lowerIndex, int middle, int higherIndex) {
	    	int[] temp=new int[higherIndex-lowerIndex+1];
	        for (int i = lowerIndex; i <= higherIndex; i++) {
	            temp[i-lowerIndex] = array[i];
	        }
	        int i = lowerIndex;
	        int j = middle + 1;
	        int k = lowerIndex;
	        while (i <= middle && j <= higherIndex) {
	            if (temp[i-lowerIndex] < temp[j-lowerIndex]) {
	                array[k] = temp[i-lowerIndex];
	                i++;
	            } else {
	                array[k] = temp[j-lowerIndex];
	                j++;
	                //cnt+=(middle+1-i);
	            }
	            k++;
	        }
	        while (i <= middle) {
	            array[k] = temp[i-lowerIndex];
	            k++;
	            i++;
	        }
	        while(j<=higherIndex){
	        	array[k]=temp[j-lowerIndex];
	        	k++;
	        	j++;
	        }
	        /*pw.println(lowerIndex+" "+higherIndex);
	        for(int m=lowerIndex;m<=higherIndex;m++)
	        	pw.print(array[m]+" ");
	        pw.println();*/
	    }
	}
		private static class DSU{
			int[] parent;
			int[] rank;
			int cnt;
			public DSU(int n){
				parent=new int[n];
				rank=new int[n];
				for(int i=0;i<n;i++){
					parent[i]=i;
					rank[i]=1;
				}
				cnt=n;
			}
			int find(int i){
		        while(parent[i] !=i){
		        	parent[i]=parent[parent[i]];
		        	i=parent[i];
		        }
		        return i;
		    }
			int Union(int x, int y){
		        int xset = find(x);
		        int yset = find(y);
		        if(xset!=yset)
		        	cnt--;
		        if(rank[xset]<rank[yset]){
		        	parent[xset] = yset;
			        rank[yset]+=rank[xset];
			        rank[xset]=0;
			        return yset;
		        }else{
		        	parent[yset]=xset;
		        	rank[xset]+=rank[yset];
		        	rank[yset]=0;
		        	return xset;
		        }
		    }
		}
		static void multiply(long[][] a, long[][] b,long m){
			int n=a.length;
		    long[][] mul=new long[n][n];
		    for (int i = 0; i < n; i++){
		        for (int j = 0; j < n; j++){
		            mul[i][j] = 0;
		            for (int k = 0; k < n; k++)
		                mul[i][j] = (mul[i][j]+(a[i][k]*b[k][j])%m)%m;
		        }
		    }
		    for (int i=0; i<n; i++)
		        for (int j=0; j<n; j++)
		            a[i][j] =mul[i][j];
		}
	
}

