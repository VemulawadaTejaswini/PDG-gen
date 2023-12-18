import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        int tests;
        int n;
        int m;
      double sum=0;
         n = sc.nextInt();
      m = sc.nextInt();
       
      if(m>n){
        int k= Math.abs(m-n);
        if(k>=m){
          System.out.println(0);
        }
        else{
          System.out.println(1);
        }
      }else if(m==n){
         System.out.println(0);
      } else {
        int l = n/m;
        int rem = n%m;
        int x = Math.abs(rem-m);
         if(x>=m){
          System.out.println(l);
        }
        else{
          System.out.println(l+1);
        }
      }
          
          
          
       
       
        
  }
}
        
