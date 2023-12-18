import java.util.*;
public class Main {
	static long [][]memo;
	
	static int [] w,v;
	static int n;
	public static long dp(int ne,int we) {
		if(ne==n)
			return 0;
		if(memo[ne][we]!=-1)
			return memo[ne][we];
		long t=0,l=-1;
		if(we>=w[ne])
		t=v[ne]+dp(ne+1,we-w[ne]);
		l=dp(ne+1,we);
		return memo[ne][we]=Math.max(t, l);
		 
	}
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int wmax=sc.nextInt();
		w=new int[n];
		v=new int[n];
		memo=new long[n][wmax+1];
		for(long[]x:memo) {
			Arrays.fill(x,-1);
		}
		for(int i=0;i<n;i++) {
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
		}
		for(int i=n-1;i>0;i-=10)
			dp(i,wmax);
		System.out.print(dp(0,wmax));
				
		
		
		sc.close();
	}

		
	}


