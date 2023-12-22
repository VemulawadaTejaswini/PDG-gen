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
        int n = s.nextInt();
        long m = 1;
        for(int i=0; i<n; i++)
        {
            long x = s.nextLong();
            m*=x;
        }
        if(m>(long)Math.pow(10, 18))
            System.out.println(-1);
        else
            System.out.println(m);
    }
}
