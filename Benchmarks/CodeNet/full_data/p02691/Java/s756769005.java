import java.util.*;
public class Main {
 final static int maxn=(int)2e5+10;
 static int l[]=new int [maxn];static int r[]=new int [maxn];
 static int slove(int len,int num)
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
	   int index=slove(n,l[i]);
	   if(r[index]==l[i])
	   {
		   for(int j=index;j<=n;j++)
		   {
			   if(r[j]==l[i])ans++;
			   else
				   break;
		   }
	   }
   }
   System.out.println(ans);;
 }
} 
