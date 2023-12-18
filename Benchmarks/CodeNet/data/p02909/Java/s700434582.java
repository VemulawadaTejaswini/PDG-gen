/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main {
  public static void main (String[] args) throws java.lang.Exception {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String[] weather = {"Sunny", "Cloudy", "Rainy"};
	if (s.equals("Sunny")) System.out.println("Cloudy");
	else if (s.equals("Cloudy")) System.out.println("Rainy");
	else System.out.println("Sunny");
  }
}