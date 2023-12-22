import java.util.*;
 import java.math.BigInteger;
 import java.lang.*;
public class Main
{
	// static int ans[];
	public static  void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a[]=sc.nextLine().split(" ");
		int n=Integer.parseInt(a[0]);
		int m=Integer.parseInt(a[1]);
		boolean visited[]=new boolean[n];
		ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
		int ans[]=new int[n];
		for(int i=0;i<n;i++){arr.add(new ArrayList<>());}
			// int start=0;
		for(int i=0;i<m;i++)
		{
			String h[]=sc.nextLine().split(" ");
			// if(i==0){start=Integer.parseInt(h[1])-1;}
			arr.get(Integer.parseInt(h[0])-1).add(Integer.parseInt(h[1])-1);
			arr.get(Integer.parseInt(h[1])-1).add(Integer.parseInt(h[0])-1);
		}
		visited[0]=true;
		int level=1;
		ArrayList<Integer>arr1=new ArrayList<>();
		arr1.add(0);
		while(arr1.size()!=0)
		{
			int size=arr1.size();
			for(int i=0;i<size;i++)
			{
				int top=arr1.get(0);
				arr1.remove(0);
				for(int node:arr.get(top)){
					// System.out.println(node);
					if(!visited[node])
					{
						ans[node]=level;
						visited[node]=true;
						arr1.add(node);
					}
				}
			}
			level+=1;
		}
		int flag=0;
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<n;i++)
		{
			if(!visited[i]){flag=1;
				break;}
				sb.append(ans[i]+"\n");
		}
		if(flag==1){System.out.println("No");}
		else{System.out.println("Yes");System.out.print(sb);}
		

	}
	
	// static int dfs4(int dp[], ArrayList<Pair>arr, int state, int gg[], int i, int x, int cost)

	// {
	// 	if(i==arr.size()){for(int j=0;j<gg.length;j++){if(gg[j]<x){return Integer.MAX_VALUE;}}return cost;}
	// 	if(dp[state]!=0){return dp[state];}
	// 	int a=dfs4(dp,arr,state,gg,i+1,x,cost);
	// 	int aa[]=new int[gg.length];
	// 	System.arraycopy(gg,0,aa,0,aa.length);
	// 	for(int j=0;j<arr.get(i).b.size();j++)
	// 	{
	// 		aa[j]+=arr.get(i).b.get(j);
	// 	}
	// 	// System.out.println(Arrays.toString(aa));
	// 	state=state+(int)Math.pow(2,i);
	// 	int b=dfs4(dp,arr,state,aa,i+1,x,cost+arr.get(i).a);
	// 	dp[state]=Math.min(a,b);
	// 	return Math.min(a,b);
	// }
	// static long get3(double n, int steps)
	// {
	// 	if(n<1){return Integer.MAX_VALUE;}
	// 	if(n==1){return steps;}

	// 	System.out.println(n);
	// 	return get3(n/2.0-1,steps+1);
	// }
	// static String get(long a, long b)
	// {long y=1;
	// 	while(true)
	// 	{

	// 		long z=y-a;
	// 		long q=get2(y,z);
	// 		// System
	// 		if(q==b){return y+" "+z;}
	// 		else if(q>b){return "-1";}
	// 		y+=1;
	// 	}
	// 	// return "-1";
	// }
	// static long get2(long y, long z)
	// {
	// 	return (long)(Math.pow(y,4)+Math.pow(y,3)*z+Math.pow(y,2)*Math.pow(z,2)+y*Math.pow(z,3)+Math.pow(z,4));
	// }
	// static void get(ArrayList<ArrayList<Integer>>arr, int i , int p,int val[], int arr1[], int len)
	// {
	// 	for(int j=0;j<arr.get(i).size();j++)
	// 	{
	// 		if(ans[arr.get(i).get(j)]==0 && arr.get(i).get(j)!=p){
	// 		if(val[arr.get(i).get(j)]>arr1[len-1])
	// 		{
	// 			arr1[len]=val[arr.get(i).get(j)];
	// 			ans[arr.get(i).get(j)]=len+1;
	// 			get(arr,arr.get(i).get(j),i,val,arr1,len+1);
				
	// 		}
	// 		else
	// 		{
	// 			int index=bin(arr1, val[arr.get(i).get(j)], len-1);
	// 			ans[arr.get(i).get(j)]=len;
	// 			// int g=arr1[index];
	// 			arr1[index]=val[arr.get(i).get(j)];
	// 			get(arr,arr.get(i).get(j),i,val,arr1,len);
	// 			// arr1[index]=g;
	// 		}}

	// 	}
	// }
	// static int bin(int arr[], int val, int len)
	// {
	// 	if(arr[0]>=val){return 0;}
	// 	int l=0;
	// 	int r=len;
	// 	while (r - l > 1) { 
 //            int m = l + (r - l) / 2; 
 //            if (arr[m] >= val) 
 //                r = m; 
 //            else
 //                l = m; 
 //        } 
  
 //        return r; 
	// 	// return l;
	// }
	
	

}
class Pair
{
	int a;
int b;
	Pair(int e,int  f){
		a=e;
		b=f;
		
	}
}



	
