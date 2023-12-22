import java.io.*;
import java.util.Scanner;
 
public class Main{
  public static void main(String[] args)throws IOException{
       Scanner scan=new Scanner(System.in);
        int l,r,d;
        int count=0;
        
       
        l=scan.nextInt();
       
        r=scan.nextInt();
      
        d=scan.nextInt();
       
    
      for(int i=l;i<r;i++){
        if(i%d==0)System.out.println(count);
         count++;
        
          }
  
  }
}