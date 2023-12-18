import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
	
		
	Scanner sc= new Scanner(System.in);
	
	
	
	long x=sc.nextLong();
	long y=sc.nextLong();
	
	
	
	if(Math.abs(x)==Math.abs(y)){
		System.out.println(1);
	return;
	}
	
	
	if(x<0&&y>x)
	System.out.println(Math.abs(y)-Math.abs(x));
	
	else 
		if(x<0&&y<x)
		{
			System.out.println(2+Math.abs(y)-Math.abs(x));
		}
		else 
			if(x>0&&y<x)
			{
			if(y<0)
		System.out.println(1+Math.abs(x-y));
			else if(y>0)
				System.out.println(2*y +1);
			else if(y==0)
		System.out.println(Math.abs(x)+1);
			}
			else if(x>0&&y>x)
			{
			
			System.out.println(y-x);
				
			}
	
	
	}
}

