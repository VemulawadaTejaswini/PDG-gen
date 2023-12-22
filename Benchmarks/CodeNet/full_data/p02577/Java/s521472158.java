

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int sum = 0;
        for(int j=0; j<str.length(); j++)
        {
            sum+=Character.getNumericValue(str.charAt(j));
        }
        if(sum%9==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}