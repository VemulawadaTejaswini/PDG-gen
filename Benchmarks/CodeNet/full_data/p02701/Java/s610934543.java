/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Main {
    
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		HashSet<String>hs=new HashSet<>();
		for(int i=0;i<n;i++)
		{hs.add(s.next());}
		System.out.println(hs.size());
	}
}
		
		
		   