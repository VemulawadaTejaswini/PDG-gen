import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        int tests;
        int n;
        int m;
      int l;
      int sum=0;
        
        int[] A = new int[n];
       
        n = sc.nextInt();
      m = sc.nextInt();
      for(int i=0;i<n;i++){
        A[i]= sc.nextInt();
         sum = sum+A[i];
      }
      int count=0;
      for(int i=0;i<n;i++){
       if(A[i] >= sum/(4*m)){
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
        
