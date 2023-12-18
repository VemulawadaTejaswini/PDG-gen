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
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        char[] ch = new char[n];
        int tr = 0;
        for(int i=0; i<n; i++)
        {
            String str = s.next();
            tr++;
            if(str.equals("AB"))
            {
                if(a>b)
                {
                    a--;
                    b++;
                    ch[i]='B';
                }
                else
                {
                    a++;
                    b--;
                    ch[i] = 'A';
                }
                if(a<0||b<0)
                    break;
            }
            else if(str.equals("BC"))
            {
                if(b>c)
                {
                    b--;
                    c++;
                    ch[i]='C';
                }
                else
                {
                    b++;
                    c--;
                    ch[i] = 'B';
                }
                if(c<0||b<0)
                    break;
            }
            else
            {
                if(a>c)
                {
                    a--;
                    c++;
                    ch[i]='C';
                }
                else
                {
                    a++;
                    c--;
                    ch[i] = 'A';
                }
                if(a<0||c<0)
                    break;
            }
        }
        if(tr==n)
        {
            System.out.println("Yes");
            for(int i=0; i<n; i++)
            {
                System.out.println(ch[i]);
            }
        }
        else
            System.out.println("No");
    }
}
