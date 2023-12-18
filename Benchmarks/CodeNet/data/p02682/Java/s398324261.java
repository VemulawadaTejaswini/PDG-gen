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
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int k = s.nextInt();
        int x = a+b;
        int y = x+c;
        if(k<a)
            System.out.println(k);
        else if(k < x)
            System.out.println(a);
        else if(k<=y)
            System.out.println(a+x-k);
    }
}
