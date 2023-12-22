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
        int h1 = s.nextInt();
        int m1 = s.nextInt();
        int h2 = s.nextInt();
        int m2 = s.nextInt();
        int k = s.nextInt();
        int c = 0;
        int st = h1*60+m1;
        int ed = h2*60+m2;
        for(int i=0; ;i++)
        {
            st+=k;
            if(st<ed)
                c+=k;
            else
                break;
        }
        System.out.println(c);
    }
}
