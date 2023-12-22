import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long A = sc.nextLong(); //1
      long B = sc.nextLong(); //2
      long C = sc.nextLong(); //3
      long K = sc.nextLong(); //4
      long max = 0;
      
      if(K >= A){ //K=4,A=1
        max += A; //max=1
        K -= A; //K=3
      }else if(A > K){
        max += K;
        K = 0;
      }

      if(K >= B){ //K=3,B=2
        K -= B; //K=1
      }
      
        max -= K; //K=1,max=0
        System.out.println(max);
   }
}
