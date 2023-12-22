/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr = new int[6];
        int num = 0;
        Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			if (num==0){
				num = sc.nextInt();
			}else{
				Double dbl = sc.nextDouble();
				
				if(dbl < 165){
					arr[0]++;
				}else if(dbl < 170){
					arr[1]++;
				}else if(dbl < 175){
					arr[2]++;
				}else if(dbl < 180){
					arr[3]++;
				}else if(dbl < 185){
					arr[4]++;
				}else{
					arr[5]++;
				}
			}
		}
		Output(arr);
	}
	
	private static void Output(int[] arr){
		String str = "";
		for(int i=0; i<arr.length; i++){
			str = i + 1 + ":";
			for(int j=0; j<arr[i]; j++){
				str = str + "*";
			}
			System.out.println(str);
		}
	}
}