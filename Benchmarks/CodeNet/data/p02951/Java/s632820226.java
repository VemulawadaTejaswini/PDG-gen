import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

public class ex
{
	static Scanner cin = new Scanner(System.in);
	static PrintStream cout = new PrintStream
	(new FileOutputStream(FileDescriptor.out));

    public static void main(String args[]) 
    {
   		int t,n,a,b,c,d,e,i,j,k,x,y,z,cnt=0,cnt1=0;
    	boolean flag = false;
    	
        a=cin.nextInt();
        b=cin.nextInt();
        c=cin.nextInt();
        n=b+c;
        if(n<=a) cout.println('0');
        else cout.println(n-a);
  }
}