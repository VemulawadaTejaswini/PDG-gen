///package TopCoder;

import java.util.*;
import java.io.*;
 class Main {

	public static boolean[] visit;
	static boolean[] b;
	static int[] FF;
	static int[] A;
	static int[][]graph;
	static int n;
	static int label;
	static int max;
	public static void main(String[] ard)  throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		int n=Integer.valueOf(br.readLine().trim());
		int[] A=new int[n];
		String[] s=br.readLine().trim().split("\\s++");
		for(int i=0;i<n;i++)A[i]=Integer.valueOf(s[i]);
		int ans=0;
		for(int i=0;i<n;i++)
			if(A[i]<=2&&A[i]!=0)ans++;
		pw.println(ans+1);
	
		
	pw.close();
		
	}
	static  long getOnes(long L, long R)
	 {
		 String s="0";
		 for(int i=0;i<R;i++)
		 {
		   s+=reverse(s);	  
		 }
		long ans=0;
		for(long i=L;i<=R;i++)
		{
			if(s.charAt((int)i)=='1')ans++;
		}
		return ans; 
	 }
	public static String reverse(String s)
	{
		char[] C=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(C[i]=='0')C[i]='1';
			else C[i]='0';
		}
		String s1=new String(C);
		
		return s1;
		
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

