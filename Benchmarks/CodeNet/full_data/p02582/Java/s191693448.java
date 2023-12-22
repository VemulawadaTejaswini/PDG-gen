import java.io.*;
import java.util.*;

    public class solution 
    {
    public static void main(String args[]) {
       
       Scanner sc = new Scanner(System.in);
       
       String str = sc.next();
       int rain = 0;
       char ch;
       
       for(int i=0; i<3; i++) 
       {
         ch = str.charAt(i);
         if(ch =='R') rain++;
         else rain = 0;
       }
       
       System.out.println(rain);
       
    }
    }