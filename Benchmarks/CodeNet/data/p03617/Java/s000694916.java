import java.util.*;
public class Main{
     static double count(long y)
	 {
		 double count=0;
		 double f=2;
		 double x=1;
		 while(y>0)
		 {
			 long t=y%10;
			 y=y/10;
			 count+=(f*t);
			 f-=x;
			 x=x/2;
		 }
		 return count;
	 }
	 public static void main(String args[])
	 {
		 Scanner in=new Scanner(System.in);
		 long q=in.nextInt();
		 long h=in.nextInt();
		 long s=in.nextInt();
		 long d=in.nextInt();
		 long n=in.nextInt();
		 
		 long minans=10000000;
		 for(long i=1;i<10000;i++)
		 {
		 if(count(i)!=(double)n)
			 continue;
		 long h1=i;
		 long r=4;
		 long ans=0;
		     while(h1>0)
			 {
				 long temp=h1%10;
				 if(r==4)
					 ans+=temp*d;
				 else if(r==3)
					 ans+=temp*s;
				 else if(r==2)
					 ans+=temp*h;
				 else
					 ans+=temp*q;
				 r--;
				 h1=h1/10;
			 }
			
			 if(ans<minans)
				 minans=ans;
		 }
		 System.out.println(minans);
	 }

}