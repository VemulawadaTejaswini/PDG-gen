import java.util.*;
public class Main {
 final static int maxn=(int)2e5+10;
 static int l[]=new int [maxn];static int r[]=new int [maxn];
 static int lowerbound(int len,int num)
 {
	 int left=1;int right=len;
	 while(left<right)
	 {
		 int mid=(left+right)/2;
		 if(r[mid]>=num)right=mid;
		 else
			 left=mid+1;
	 }
	 return left;
 }
 static int upperbound(int len,int num)
 {
	 int left=1;int right=len;
	 while(left<right)
	 {
		 int mid=(left+right)/2;
		 if(r[mid]<=num)left=mid+1;
		 else
			 right=mid;
	 }
	 return left;
 }
 public static void main(String args[])
 {
	 Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	for(int i=1;i<=n;i++)
	{
		int x=input.nextInt();
		l[i]=i-x;r[i]=i+x;
	}
	int ans=0;
   Arrays.sort(l,1,1+n);Arrays.sort(r,1,n+1);
   for(int i=1;i<=n;i++)
   {
	    int index1=lowerbound(n,l[i]);int index2=upperbound(n,l[i]);
	    if(r[index1]==r[index2-1])
	    {
	    	ans+=index2-1-index1+1;
	    }
   }
   System.out.println(ans);;
 }
} 
