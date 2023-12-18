import java.util.*;
 import java.math.BigInteger;
public class Main
{
	static int ans[];
	public static  void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String h[]=sc.nextLine().split(" ");
		int n=Integer.parseInt(h[0]);
		int m=Integer.parseInt(h[1]);
		int x=Integer.parseInt(h[2]);
		ArrayList<Pair>arr=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			String hh[]=sc.nextLine().split(" ");
			ArrayList<Integer>arr1=new ArrayList<>();
			for(int j=1;j<hh.length;j++)
			{
				arr1.add(Integer.parseInt(hh[j]));
			}
			arr.add(new Pair(Integer.parseInt(hh[0]),arr1));
		}
		int f=dfs4(new int[(int)Math.pow(2,n+1)],arr,0,new int[m],0,x,0);
		f=f==Integer.MAX_VALUE?-1:f;
		System.out.println(f);

	}
	static int dfs4(int dp[], ArrayList<Pair>arr, int state, int gg[], int i, int x, int cost)

	{
		if(i==arr.size()){for(int j=0;j<gg.length;j++){if(gg[j]<x){return Integer.MAX_VALUE;}}return cost;}
		if(dp[state]!=0){return dp[state];}
		int a=dfs4(dp,arr,state,gg,i+1,x,cost);
		int aa[]=new int[gg.length];
		System.arraycopy(gg,0,aa,0,aa.length);
		for(int j=0;j<arr.get(i).b.size();j++)
		{
			aa[j]+=arr.get(i).b.get(j);
		}
		// System.out.println(Arrays.toString(aa));
		state=state+(int)Math.pow(2,i);
		int b=dfs4(dp,arr,state,aa,i+1,x,cost+arr.get(i).a);
		dp[state]=Math.min(a,b);
		return Math.min(a,b);
	}
	static long get3(double n, int steps)
	{
		if(n<1){return Integer.MAX_VALUE;}
		if(n==1){return steps;}

		System.out.println(n);
		return get3(n/2.0-1,steps+1);
	}
	static String get(long a, long b)
	{long y=1;
		while(true)
		{

			long z=y-a;
			long q=get2(y,z);
			// System
			if(q==b){return y+" "+z;}
			else if(q>b){return "-1";}
			y+=1;
		}
		// return "-1";
	}
	static long get2(long y, long z)
	{
		return (long)(Math.pow(y,4)+Math.pow(y,3)*z+Math.pow(y,2)*Math.pow(z,2)+y*Math.pow(z,3)+Math.pow(z,4));
	}
	static void get(ArrayList<ArrayList<Integer>>arr, int i , int p,int val[], int arr1[], int len)
	{
		for(int j=0;j<arr.get(i).size();j++)
		{
			if(ans[arr.get(i).get(j)]==0 && arr.get(i).get(j)!=p){
			if(val[arr.get(i).get(j)]>arr1[len-1])
			{
				arr1[len]=val[arr.get(i).get(j)];
				ans[arr.get(i).get(j)]=len+1;
				get(arr,arr.get(i).get(j),i,val,arr1,len+1);
				
			}
			else
			{
				int index=bin(arr1, val[arr.get(i).get(j)], len-1);
				ans[arr.get(i).get(j)]=len;
				// int g=arr1[index];
				arr1[index]=val[arr.get(i).get(j)];
				get(arr,arr.get(i).get(j),i,val,arr1,len);
				// arr1[index]=g;
			}}

		}
	}
	static int bin(int arr[], int val, int len)
	{
		if(arr[0]>=val){return 0;}
		int l=0;
		int r=len;
		while (r - l > 1) { 
            int m = l + (r - l) / 2; 
            if (arr[m] >= val) 
                r = m; 
            else
                l = m; 
        } 
  
        return r; 
		// return l;
	}
	
	

}
class Pair
{
	int a;
	ArrayList<Integer>b;
	Pair(int e,ArrayList<Integer> f){
		a=e;
		b=f;
		
	}
}



	
