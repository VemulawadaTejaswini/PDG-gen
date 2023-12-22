import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int n=sc.nextInt();
	int count=0;
	for(int i=0;i<x;i++)
	{
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	   
	    if( Math.sqrt((a*a)+(b*b))<=n)
               count++;	    
	}
	System.out.println(count);
}
}