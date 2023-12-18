/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		boolean flag = false;
		for(int i=1;i<=10000000;i++)
		{
		    if((int)Math.floor(0.08*i)==n&&(int)Math.floor(0.1*i)==m){
		        System.out.println(i);
		        flag = true;
		        break;
		    }
		    else
		        flag = false;
		}
		if(!flag)
		    System.out.println(-1);
		
	}
}