import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt(); //1
      int B = sc.nextInt(); //2
      int C = sc.nextInt(); //3
      int K = sc.nextInt(); //4
      int max = 0;
      
      if(K >= A){ //K=4,A=1
        max += A; //max=1
        K -= A; //K=3
      }
      
      if(K >= B){ //K=3,B=2
        K -= B; //K=1
      }
      
        max -= K; //K=1,max=0
        System.out.println(max);
   }
}