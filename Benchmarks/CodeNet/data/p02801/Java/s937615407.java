import java.util.*;
  class Main{
    public static void main (String[] args){ 
   
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt();
      int M = sc.nextInt();
      
      int[] A = new int[N];
      int sum = 0;
      
      for(int i = 0; i < N -1 ; i++){
      	A[i] = sc.nextInt();
        sum += A[i];
      }
      if((N*M-sum) > K){
      	System.out.println("-1");  
      }
      else if((N*M-sum) <= 0){
      	System.out.println("0");    
      }
      else {
      	System.out.println(M*M-sum);    
      }
    }
  }
