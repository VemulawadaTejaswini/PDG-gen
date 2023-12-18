import java.util.*;
import java.io.*;

class q1
{	
public static void main( String args[])throws IOException
{
	int h,x,n;
    Scanner in =new Scanner (System.in);

    h=in.nextInt();
    x=in.nextInt();
    n=in.nextInt();

    int d=0;

    if (h>x) 
    d=h;
    else
    d=x;

    int p= n/d ;
    if(n%d!=0)
    p++;


    System.out.println(p);
        
    
}

}