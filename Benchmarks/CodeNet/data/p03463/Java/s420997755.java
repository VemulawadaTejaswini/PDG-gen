/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if((b==1&&c==2)||(b==a-1&&c==a)){
			System.out.println("Borys");
		}else if((c==1&&b==2)||(c==a-1&&b==a)){
			System.out.println("Alice");
		}else if(b+1==c||b-1==c){
			System.out.println("Borys");
		}else if(a%2==0&&b%2==0&&c%2==0){
				System.out.println("Draw");
		}else if(a%2!=0&&((b%2==0&&c%2!=0)||(b%2!=0&&c%2==0))){
			System.out.println("Draw");
		}else if(a%2!=0&&b%2==0&&c%2==0){
			System.out.println("Alice");
		}else if((a%2==0&&((b%2==0&&c%2!=0)||(b%2!=0&&c%2==0)))){
				System.out.println("Borys");
		}
	}
}