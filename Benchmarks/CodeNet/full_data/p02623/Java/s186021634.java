import java.util.*;
public class  Main
{
	static int Binary(long bp[],int m,long k)
	{
	 int ans=-1;
	 int start=0;
	 int end=m-1;
	 
	 while(start<=end)
	 {
	   int mid=start+(end-start)/2;
	   if(bp[mid]>k)
	   {
		
		end=mid-1;
	   }
	   else
	   {	
		ans=mid;
		start=mid+1;
	   }
 	 }
	 return (ans+1);
	  
	}
	 public static void main(String[] args)
	 {
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int m=s.nextInt();
	   long k=s.nextLong();
	   long a[]=new long[n];
	   long b[]=new long[m];
	   long bp[]=new long[m];
	   long ap[]=new long[n];
	   long ans=0;
	   long fans=0;
	  //int l[]=new int[n];
	   for(int i=0;i<n;i++)
	   {
		a[i]=s.nextLong();
	   }
	   for(int i=0;i<m;i++)
	   {
		b[i]=s.nextLong();
	   }
	      ap[0]=a[0];
	      bp[0]=b[0];
	      for(int i=1;i<m;i++)
	      {bp[i]=bp[i-1]+b[i];}
	      for(int i=1;i<n;i++)
	      {ap[i]=ap[i-1]+a[i];}	
	 
	  for(int i=0;i<n;i++)
	   {
		long temp=k;
		ans=0;
		if(temp>=ap[i])
		{
		  temp-=ap[i];
		  ans+=i+1;
		  //System.out.println((i+1)+" "+Binary(bp,m,temp));
		  ans+=Binary(bp,m,temp);
		 fans=Math.max(ans,fans);
		}
	   }
	  for(int i=0;i<m;i++)
	   {
		long temp=k;
		ans=0;
		if(temp>=bp[i])
		{
		  temp-=bp[i];
		  ans+=i+1;
		  //System.out.println((i+1)+" "+Binary(bp,m,temp));
		  ans+=Binary(ap,n,temp);
		 fans=Math.max(ans,fans);
		}
	   }
	   System.out.println(fans);
	   
	 }	
}