import java.util.*;
 import java.math.BigInteger;
public class Main
{
	static int ans[];
	public static  void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		// String h[]=sc.nextLine().split(" ");
		int n=Integer.parseInt(sc.nextLine());
		ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
		String s[]=sc.nextLine().split(" ");
		int val[]=new int[n];
		for(int i=0;i<n;i++){val[i]=Integer.parseInt(s[i]);arr.add(new ArrayList<Integer>());}
		for(int i=0;i<n-1;i++){
			String h[]=sc.nextLine().split(" ");
			arr.get(Integer.parseInt(h[0])-1).add(Integer.parseInt(h[1])-1);
		}
		int arr1[]=new int[n];
		arr1[0]=val[0];
		ans=new int[n];
		ans[0]=1;
		get(arr,0,val,arr1,1);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++){sb.append(ans[i]+"\n");}
			System.out.print(sb);
		
	}
	static void get(ArrayList<ArrayList<Integer>>arr, int i , int val[], int arr1[], int len)
	{
		for(int j=0;j<arr.get(i).size();j++)
		{
			if(val[arr.get(i).get(j)]>=arr1[len-1])
			{
				arr1[len]=val[arr.get(i).get(j)];
				ans[arr.get(i).get(j)]=len+1;
				get(arr,arr.get(i).get(j),val,arr1,len+1);
				
			}
			else
			{
				int index=bin(arr1, val[arr.get(i).get(j)], len-1);
				ans[arr.get(i).get(j)]=len;
				int g=arr1[index];
				arr1[index]=val[arr.get(i).get(j)];
				get(arr,arr.get(i).get(j),val,arr1,len);
				arr1[index]=g;
			}

		}
	}
	static int bin(int arr[], int val, int len)
	{
		int l=0;
		int r=len;
		while(l<=r)
		{
			int mid=l+(r-l)/2;
			if(arr[mid]==val){return mid;}
			if(arr[mid]>val){r=mid-1;}
			else{l=mid+1;}
		}
		return l;
	}
	
	

}
class Pair
{
	int a;
	int b;
	int c;
	int d;
	Pair(int e,int f, int g,int h){
		a=e;
		b=f;
		c=g;
		d=h;
	}
}



	
