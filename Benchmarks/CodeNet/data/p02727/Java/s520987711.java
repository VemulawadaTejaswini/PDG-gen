import java.util.*;
public class Main { 
	final static int maxn=(int)2e5+10;
	static int A[]=new int [maxn];
	static int B[]=new int [maxn];
	static int C[]=new int [maxn];
	static int newa[]=new int [maxn];
	static int newb[]=new int [maxn];
 public static void main(String args[])
 {
	 Scanner input=new Scanner(System.in);
     int x,y,a,b,c;
     x=input.nextInt();y=input.nextInt();a=input.nextInt();
     b=input.nextInt();c=input.nextInt();
     for(int i=1;i<=a;i++)A[i]=input.nextInt();
     for(int i=1;i<=b;i++)B[i]=input.nextInt();
     for(int i=1;i<=c;i++)C[i]=input.nextInt();
     Arrays.sort(A,1,1+a);Arrays.sort(B,1,1+b);Arrays.sort(C,1,1+c);
     int cnt=0;
     for(int i=a-x+1;i<=a;i++)
     {
    	 newa[++cnt]=A[i];
     }
     cnt=0;
     for(int i=b-y+1;i<=b;i++)newb[++cnt]=B[i];
     int l1=1;int l2=1;
     /*
     for(int i=1;i<=x;i++)System.out.print(newa[i]+" ");
     System.out.println();
     for(int i=1;i<=y;i++)System.out.print(newb[i]+" ");
     System.out.println();*/
     for(int i=c;i>=1;i--)
     {
    	 if(l1==x&&l2==y)break;
    	 if(C[i]-newa[l1]>C[i]-newb[l2])
    	 {
    		 if(C[i]-newa[l1]>0&&l1<=x)
    			 {newa[l1]=C[i];l1++;}
    		 else if(l1>x&&C[i]-newb[l2]>0)
    		 {
    			 newb[l2]=C[i];l2++;
    		 }
    	 }
    	 else if(C[i]-newa[l1]<C[i]-newb[l2])
    	 {
    		   if(C[i]-newb[l2]>0&&l2<=y)
    		   {
    			   newb[l2]=C[i];l2++;
    		   }
    		   else if(l2>y&&C[i]-newa[l1]>0)
    		   {
    			   newa[l1]=C[i];l1++;
    		   }
    	 }
     }
     long sum=0;
     for(int i=1;i<=x;i++)
    	 sum+=newa[i];
     for(int i=1;i<=y;i++)
    	 sum+=newb[i];
     System.out.println(sum);
     
}
}