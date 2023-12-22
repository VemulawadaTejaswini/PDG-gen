/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	static final Scanner stdin = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		int res,flag;
		//get input num
		while(stdin.hasNext()){
			int n = stdin.nextInt();
			res  = 0;
			
			//System.out.println(n);
			for(int i = 2; i <= n;i++){
				flag = 0;
				//System.out.println(i);
				for(int j = 2;j<i;j++){
					if(i%j==0){
						flag = 1;
						break;
					}
				}
				if(flag == 0){
					res+=1;
				}
			}
			System.out.println(res);
		}
	}
}