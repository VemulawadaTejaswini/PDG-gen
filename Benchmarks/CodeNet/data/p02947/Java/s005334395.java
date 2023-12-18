

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
		String ar[]=new String[n+1];
		for(int i=0;i<n;i++)
		{
			String x=scan.next();
			ar[i]=sortString(x);
			

		}
		ar[0]="";
		Arrays.sort(ar);
		
		long pairs=0L;
		int same=1;
//		for(String x:ar)System.out.println(x);
		String ss=ar[0];
		for(int i=1;i<=n;i++)
		{
			if(ss.equals(ar[i+1]))
			{
				same++;
				
			}else {
//				System.out.println(same);
				long x=same*(same-1)/2;
//				System.out.println(x);
				pairs+=x;
				ss=ar[i];
				same=1;
			}
		}
//		System.out.println(same);
		pairs+=same*(same-1)/2;
		
		System.out.println(pairs);
		
	}
}
