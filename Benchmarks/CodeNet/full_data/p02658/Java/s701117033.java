/* package codechef; // don't place package name! */
import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Collections;
/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner k=new Scanner(System.in);
		    int t;
		    t=k.nextInt();
		       long a[]=new long[t];
		       for(int i=0;i<t;i++)
		       a[i]=k.nextLong();
		       int flag=0;
		       BigInteger b=new BigInteger("1");
		       BigInteger c=new BigInteger("1000000000000000000");
		       for(int i=0;i<t;i++)
		      {
		          b=b.multiply(BigInteger.valueOf(a[i]));
		          if(b.compareTo(c)>0)
		          {
		              flag=1;
		              break;
		          }
		      }
		      if(flag==1)
		      System.out.println("-1");
		      else
		      System.out.println(b);
		      
		        }
		    catch(Exception e) {
		    return;
		}
	}
}