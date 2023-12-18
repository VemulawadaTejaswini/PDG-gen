import java.io.*;
import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
        String b=sc.next();
        
        int x=0;
        
        char c[]=b.toCharArray();
        int f[];
        for(int d=0;d<a;d++) 
         {
             char r=b.charAt(d);
             if(r=='I')
             x++;
             else 
             x--;
             
             f[d]=x;
             
         }
         Arrays.sort(f);
         int h=f[(b.length()-1)];



}}