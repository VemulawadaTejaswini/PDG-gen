import java.util.*;
import java.math.*;
class Main{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
		     int n=in.nextInt();
		    long a=in.nextInt();
		    long b=in.nextInt();
		    long c=in.nextInt();
		    String s[]=new String[n];
		    for(int i=0;i<n;i++)
		    {
		      s[i]=in.next();
		    }
		    int A=0,B=0,C=0;
		     for(int i=0;i<n;i++)
		       {
		         String x=s[i];
		         for(int j=0;j<2;j++)
		         {
		           if(x.charAt(j)=='A')
		             A++;
		           else if(x.charAt(j)=='B')
		             B++;
		           else
		             C++;
		         }
		       }
		    long sum=0,sum1=0;
		     if(A!=0)
		     {
		       sum=sum+A;
		       sum1=sum1+a;
		     }
		    if(B!=0)
		     {
		       sum=sum+B;
		       sum1=sum1+b;
		     }
		    if(C!=0)
		     {
		       sum=sum+C;
		       sum1=sum1+c;
		     }
		    if(sum>sum1)
		      System.out.print("No");
		    else
		    {
		      System.out.println("Yes");
		      for(int i=0;i<n;i++)
		      {
		         String x=s[i];
		         if(x.equals("AB"))
		            {
		              if(a>=b)
		              {
		                a--;
		                b++;
		                System.out.println("B");
		              }
		              else
		              {
		                b--;
		                a++;
		                System.out.println("A");
		              }
		            }
		          if(x.equals("AC"))
		             {
		              if(a>=c)
		              {
		                a--;
		                c++;
		                System.out.println("C");
		              }
		              else
		              {
		                c--;
		                a++;
		                System.out.println("A");
		              }
		            }
		           if(x.equals("BC"))  
		              {
		              if(b>=c)
		              {
		                b--;
		                c++;
		                System.out.println("C");
		              }
		              else
		              {
		                c--;
		                b++;
		                System.out.println("B");
		              }
		            }
		        
		      }
		    }
		       
		      
		    
		    
		    
		  }
		}