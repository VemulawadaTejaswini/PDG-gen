import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        int tests;
        int n;
        int m;
      int l;
      double sum=0;
         n = sc.nextInt();
      m = sc.nextInt();
        int[] A = new int[n];
       
       
      for(int i=0;i<n;i++){
        A[i]= sc.nextInt();
         sum = sum+A[i];
      }
      int count=0;
      for(int i=0;i<n;i++){
       if(A[i] >= (int)Math.floor(sum/(4*m))){
         count++;
       }
        
      }
          if(count>=m){
            System.out.println("Yes");
          }
          else{
             System.out.println("No");
          }
       
       
        
  }
}
        
