/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = 1;
		String prev = s.charAt(0)+"";
		int previd = 1;
		for(int i=1;i<s.length();i++){
		    String t = s.substring(previd, i+1);
		    if(!prev.equals(t)){
		        k++;
		        prev = t;
		        previd = i+1;
		    }
		}
		System.out.println(k);
	}
}