/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int c = in.nextInt();
    if ((n + m) >= c) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}