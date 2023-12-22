import java.io.*;
import java.util.Scanner;
 
public class Main{
  public static void main(String[] args)throws IOException{
       Scanner scan=new Scanner(System.in);
       int n,count;
       count=0;
       int m[]=new int[10];
       int c[][]=new int[2][];
       
        n=scan.nextInt();
        
    
      for(int i=0;i<n;i++){
        m[i]=scan.nextInt();
        c[0][0]=m[0];
        if(i%2==1&&c[0][i]%2==1)
         count++;
        
          }
    System.out.println(count);
  
  }
}