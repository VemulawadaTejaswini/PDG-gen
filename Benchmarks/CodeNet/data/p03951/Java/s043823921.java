package Main;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	

	private static Scanner in;
	

	public static void main(String[] args)
	{
		
		in = new Scanner(System.in);
		BigInteger sum,y,x,nn;
		int viz[]= new int [300000];
		int i,n,yy,a = 0,b=0;
		
		 n=in.nextInt();
		 x=in.nextBigInteger();
		nn=BigInteger.valueOf(2).multiply(BigInteger.valueOf(n).subtract(BigInteger.valueOf(1)));
		 sum=(nn.multiply(nn.add(BigInteger.valueOf(1))));
		    y=sum.subtract(x.multiply((nn.multiply(BigInteger.valueOf(2))).subtract(BigInteger.valueOf(2))));
		    yy=y.intValue();
		    int ok;
		    ok=0;
		    if(yy%2==0)
		    	yy++;
		    if(yy>2*n-1)
		    {
		    	System.out.print("NO\n");
		  		return;
		    }
		    
		    for(i=1;i<yy;i++)
		    {
		    	a=i;
		    	b=yy-i;
		    	if(a!=b)
		    	{
		    		ok=1;
		    		break;
		    	}
		    	}
		    
		  	if(ok==0)
		  	{
		  		System.out.print("NO\n");
		  		return;
		  	}
		    System.out.print("YES\n");
		   System.out.print(a+" ");
		   viz[a]=1;
		   viz[b]=1;
		   for(i=1;i<2*n;i++)
			   if(viz[i]==0)
				   System.out.print(i+" ");
		   System.out.print(b+" ");
		//System.out.println(" \n");
	}
	}




