

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	 public static String sortString(String inputString) 
	    { 
	        // convert input string to char array 
	        char tempArray[] = inputString.toCharArray(); 
	          
	        // sort tempArray 
	        Arrays.sort(tempArray); 
	          
	        // return new sorted string 
	        return new String(tempArray); 
	    } 
	public static void main(String args[])
	{
//		System.out.println("lol");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String ar[]=new String[n];
		for(int i=0;i<n;i++)
		{
			String x=scan.next();
			ar[i]=sortString(x);
			

		}
		
		Arrays.sort(ar);
		
		long pairs=0;
		int same=0;
//		for(String x:ar)System.out.println(x);
		for(int i=0;i<n-1;i++)
		{
			if(ar[i].equals(ar[i+1]))
			{
				same++;
				
			}else {
//				System.out.println(same);
				int x=same*(same+1)/2;
//				System.out.println(x);
				pairs+=x;
				same=0;
			}
		}
//		System.out.println(same);
		pairs+=same*(same+1)/2;
		
		System.out.println(pairs);
		
	}
}
