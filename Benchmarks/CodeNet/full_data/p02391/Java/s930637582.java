/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
//class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader stdReader =
            new BufferedReader(new InputStreamReader(System.in));
        String[] nums = stdReader.readLine().split(" ");
         
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        
        if(a > b) {
        	System.out.println("a > b");
        } else if(a < b) {
        	System.out.println("a < b");
        } else {
        	System.out.println("a == b");
        }
	}
}