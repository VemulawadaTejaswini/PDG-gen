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
        String h="";
       
        for(int d=0;d<a;d++) 
         {
             char r=b.charAt(d);
             if(r=='I')
             x++;
             else 
             x--;
             
             h=h+x;
             
         }
        char s[]= h.toCharArray();
        Arrays.sort(s);
        
        char z=s[(b.length()-1)];
        System.out.println(z);



}}