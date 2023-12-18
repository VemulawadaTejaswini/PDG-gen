import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]d=new int[n];
		for(int i=0;i<n;++i)
			++d[s.nextInt()-1];

		Arrays.sort(d);
		//System.err.println(Arrays.toString(d));

		/*
		int[]count=new int[n+1];
		for(int i:d)
			++count[i];
		System.err.println(Arrays.toString(count));
		*/

		int[]p=new int[n+1];
		System.arraycopy(d,0,p,1,n);
		Arrays.parallelPrefix(p,Integer::sum);
		//System.err.println(Arrays.toString(p));

		for(int k=1;k<=n;++k)
			System.out.println((p[n+1-k]+k-1)/k);
	}
}
