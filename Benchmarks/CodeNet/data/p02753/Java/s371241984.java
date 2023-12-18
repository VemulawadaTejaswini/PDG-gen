/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next().toUpperCase();
		HashSet<Character> set = new HashSet<>();
		for(int i=0;i<s.length();i++)
		    set.add(s.charAt(i));
		    
		if(set.size()!=1)
		    System.out.println("Yes");
		else
		    System.out.println("No");
	}
}