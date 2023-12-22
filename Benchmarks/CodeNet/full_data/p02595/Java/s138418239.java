import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	long n=sc.nextInt();
	int count=0;
	for(int i=0;i<x;i++)
	{
	    long a=sc.nextLong();
	    long b=sc.nextLong();
	   
	    if( Math.sqrt((a*a)+(b*b))<=n)
               count++;	    
	}
	System.out.println(count);
}
}