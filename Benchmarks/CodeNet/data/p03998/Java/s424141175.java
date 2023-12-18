/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
  
public class Main 
{ 
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
    public static void main (String[] args) {
        FastReader ob = new FastReader();
       String s1 = ob.next(),s2=ob.next(),s3=ob.next();
       int i=0,j=0,k=0;
       int n1=s1.length(),n2=s2.length(),n3=s3.length();
       char check=s1.charAt(i);
       i++;
       while(true){
           if(check=='a'){
               if(i<n1){
                   check=s1.charAt(i);
                   i++;
               }
               else{
                   System.out.println("A");
                   break;
               }
           }
           else if(check=='b'){
               if(j<n2){
                   check=s2.charAt(j);
                   j++;
               }
               else{
                   System.out.println("B");
                   break;
               }
           }
           else if(check=='c'){
               if(k<n3){
                   check=s3.charAt(k);
                   k++;
               }
               else{
                   System.out.println("C");
                   break;
               }
           }
       }
        
    }
}