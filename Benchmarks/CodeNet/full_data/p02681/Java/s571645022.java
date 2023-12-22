/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        /*if(a==b)
        {
                        System.out.println("No");
            
        }*/
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=b.charAt(i))
            System.out.println("No");
            else
            System.out.println("Yes");

        }

       
    }
}
