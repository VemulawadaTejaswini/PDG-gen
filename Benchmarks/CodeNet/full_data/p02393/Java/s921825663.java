import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception{
		Scanner cin= new Scanner(System.in);
		int a= cin.nextInt();
		int b= cin.nextInt();
		int c= cin.nextInt();
		
		int buf;
		
		if( a>b || a>c ){
			buf= a;
			if(	b<c ){
				a=b;
				b=buf;
			}
			else{
				a=c;
				c=buf;
			}
		}
		if( b>c ){
			buf=b;
			b=c;
			c=buf;
		}
		
		System.out.println(a+" "+b+" "+c);
	}
}