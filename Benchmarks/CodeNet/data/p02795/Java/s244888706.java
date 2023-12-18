/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
            int h = s.nextInt();
            int w = s.nextInt();
            int n = s.nextInt();
            int d = Math.max(h, w);
            if(n%d==0)
                System.out.println(n/d);
            else
                System.out.println(n/d +1);
    }
}
