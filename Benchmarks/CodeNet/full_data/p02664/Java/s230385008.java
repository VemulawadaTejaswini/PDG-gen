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
        String str = s.next();
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            if(ch[i]=='?')
            {
                if(i>0&&i<ch.length-1)
                {
                    ch[i]='D';
                }
                else
                {
                    if(i==0)
                    {
                        if(ch[1]=='P'||ch[1]=='?')
                            ch[0]='D';
                        else
                            ch[0]='P';
                    }
                    else
                        ch[i]='D';
                }
            }
            System.out.print(ch[i]);
        }
    }
}
