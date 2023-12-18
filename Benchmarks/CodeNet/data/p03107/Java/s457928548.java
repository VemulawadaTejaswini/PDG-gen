/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		int n = s.length();
		while(s.contains("01")==true)
		    s=s.replace("01","");
		while(s.contains("10")==true)
		    s=s.replace("10","");
		System.out.println(n-s.length());
		
	}
}