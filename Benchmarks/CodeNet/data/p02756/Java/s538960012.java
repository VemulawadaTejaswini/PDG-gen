/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		int q = input.nextInt();
		while(q-->0)
		{
		    int x = input.nextInt();
		    if(x==2)
		    {
		        int y = input.nextInt();
		        String str = input.next();
		        if(y==1)
		        {
		            s = str+s;
		        }
		        else{
		            s = s+str;
		        }
		    }
		    else{
		        StringBuilder sb = new StringBuilder(s);
		        sb.reverse();
		        s = sb.toString();
		    }
		}
		
		System.out.println(s);
		
	}
}