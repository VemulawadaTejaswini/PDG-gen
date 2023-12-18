import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      int k = sc.nextInt();
      long sum = 0;

      for(int i=1; i<=k; i++){
        for(int j=1; j<=k; j++){
          for(int m=1; m<=k; m++){
            int temp = gcd(i, j);
            sum += gcd(temp, m);
          }
        }
      }

      System.out.println(sum);

      sc.close();
   }

   public static int gcd(int a, int b) { 
        // Everything divides 0  
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 
       
        // base case 
        if (a == b) 
            return a; 
       
        // a is greater 
        if (a > b) 
            return gcd(a-b, b); 
        return gcd(a, b-a); 
    }
}