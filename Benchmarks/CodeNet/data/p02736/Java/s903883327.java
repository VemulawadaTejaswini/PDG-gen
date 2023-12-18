/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
If I'm the sun, you're the moon
Because when I go up, you go down
*******************************
I'm working for the day I will surpass you
https://www.a2oj.com/Ladder16.html
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class Main
   {
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         int N = Integer.parseInt(infile.readLine());
         String input = infile.readLine();
         int[] arr = new int[N];
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(input.charAt(i)+"");
         ArrayList<Integer> ls = new ArrayList<Integer>();
         for(int x: arr)
            ls.add(x);
         while(ls.size() > 1)
         {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int i=0; i < ls.size()-1; i++)
            {
               int val = Math.abs(ls.get(i)-ls.get(i+1));
               temp.add(val);
            }
            ls = new ArrayList<Integer>();
            if(same(temp))
               break;
            for(int x: temp)
               ls.add(x);
         }
         if(ls.size() > 0)
            System.out.println(ls.get(0));
         else
            System.out.println(0);
      }
      public static boolean same(ArrayList<Integer> ls)
      {
         if(ls.size() == 1)
            return false;
         int x = ls.get(0);
         for(int v: ls)
            if(v != x)
               return false;
         return true;
      }
   }