/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int h=s.nextInt();
		int a=s.nextInt();
		
		System.out.println((int)Math.ceil((double)h/a));
	}
}