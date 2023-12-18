/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int M=Integer.parseInt(s[0]);
		int D=Integer.parseInt(s[1]);
		int count=0;
		for(int i=4;i<=M;i++){
			for(int j=22;j<=D;j++){
				int unit=j%10;
				int tens=j/10;
				if(unit<2 || tens<2)
				continue;
				if((unit*tens)==i){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}