/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
	long n=s.nextLong();
	long a=s.nextLong();
	long b=s.nextLong();
	System.out.println(a+(n%(a+b)));
	}
}