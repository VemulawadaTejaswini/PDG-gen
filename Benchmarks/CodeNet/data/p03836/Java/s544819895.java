import java.util.*;
import java.io.*;


public class HelloWorld{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int sx = scanner.nextInt();
        int sy =scanner.nextInt();
        int tx = scanner.nextInt();
        int ty =scanner.nextInt();
   
        
        int y = ty- sy;
        int x = tx - sx;
        
        for(int i=0;i<y;i++)
         System.out.print("U");
        
        for(int i=0;i<x;i++)
        System.out.print("R");
        
         for(int i=0;i<y;i++)
         System.out.print("D");
        
        for(int i=0;i<=x;i++)
        System.out.print("L");
        
        for(int i=0;i<=y;i++)
         System.out.print("U");
        
        for(int i=0;i<=x;i++)
        System.out.print("R");
        
         System.out.print("D");
        
        
         System.out.print("R");
         
           for(int i=0;i<=y;i++)
         System.out.print("D");
         
          for(int i=0;i<=x;i++)
        System.out.print("L");
        
        
        System.out.print("U");
        
        
        
     }
}