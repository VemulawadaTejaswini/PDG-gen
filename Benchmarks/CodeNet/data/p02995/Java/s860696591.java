import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{	
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	long a = Long.parseLong(sc.next());
	long b = Long.parseLong(sc.next());
	int c = sc.nextInt());
	int  d = sc.nextInt();
	long s=0;
	
	
	if(c!=d){
		long z = lcm(c,d);
		
		long x = b/c - (a-1)/c;   
		long y = b/d - (a-1)/d;
		long w = b/(z) - (a-1)/(z);
		s = b-a+1-x-y+w;
	}else{
		long x = b/c - (a-1)/c;
		s = b-a+1-x;
	}	
	
	
	System.out.println(s);
}

static int lcm (int a, int b) { 	
	int temp; 	
	long c = a; 	
	c *= b; 	
	while((temp = a%b)!=0) { 	
			a = b; 	
				b = temp; 
					} 	
	return (int)(c/b); 
	}
}
