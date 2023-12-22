/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num = 100000;
		Scanner s = new Scanner(System.in);
		int weeks = s.nextInt();
		for(int i = 0;i < weeks;i++){
			num *= 1.05; 
		}
		int numx;
		int num_s = num / 10000;
		int num_c = num - num_s * 10000;
		
		if(num_c >= 0){
			numx = num_s * 10000 + 10000;
		}else{
			numx = num_s * 10000;
		}
		System.out.println(numx);
		
	}
}