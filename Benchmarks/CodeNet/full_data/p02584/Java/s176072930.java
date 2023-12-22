

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        long x = s.nextLong();
        long k = s.nextLong();
        long d = s.nextLong();
        long q = x/d;
        long m = 0;
        if(q>=k)
            m = x-k*d;
        else
        {
            k-=q;
            long r =  (x%d);
            long r1 =  (d-r);
            if(k%2==1)
                m=r;
            else
                m=r1;
        }
        System.out.println(m);
    }
}