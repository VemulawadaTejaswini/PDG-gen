

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      int K = scanner.nextInt();
      int X = scanner.nextInt();
      int Y = scanner.nextInt();
     if(K>N){
     int sum = X*N;
         System.out.println(sum);
     }
      
      if(K<N){
      int sum = (K*X + Y*(N-K));
      System.out.println(sum);
      }
        
    }
    
}
