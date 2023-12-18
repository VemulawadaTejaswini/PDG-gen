/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public final class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=1;i<=n;i++){
		    int idx = s.nextInt();
		    map.put(idx,i);
		}
		for(int i=1;i<=n;i++){
		    System.out.print(map.get(i)+" ");
		}
	}

}