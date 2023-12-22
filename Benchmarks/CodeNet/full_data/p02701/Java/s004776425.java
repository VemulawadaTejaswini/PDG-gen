/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Set<String> hash_Set = new HashSet<String>(); 
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		String s;
		for(int i=0;i<n;i++) {
		    s = sc.next();
		    hash_Set.add(s);
		}
    //   Object[] objects = hash_Set.toArray(); 
  
    //     // Printing array of objects 
    //     for (Object obj : objects) 
    //         System.out.println(obj); 
    System.out.println(hash_Set.size());
	}
}
