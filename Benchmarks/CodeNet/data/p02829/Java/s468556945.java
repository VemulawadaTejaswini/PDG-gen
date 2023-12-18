import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int p=Math.max(a,b);
		int q=Math.min(a,b);
		if(p-q>=2)
		System.out.println(p+1);
		else
		System.out.println(q+1);}}