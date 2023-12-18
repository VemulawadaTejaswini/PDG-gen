import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int X = Integer.parseInt(sc.next());
      int A = X;
      int B = 0;
      long x = 0;
      int W = 0;
      int M[] = new int[10000000];
      while(x < Math.pow(10,10)){
        M[W] = W*W*W*W*W;
        x = M[W];
        W++;
        System.out.println(x);
        if(x < 0){
          M[W] = 0;
          break;
        }

      }

      for(int i = 99; i > -1; i--){
        for(int j = 0; j < 100; j++){
          if(M[i] - M[j] == X){
            A = i;
            B = j;
          }else if(M[i] + M[j] == X){
            A = i;
            B = -1*j;
          }
        }
      }
      System.out.println(A+" "+B);
}
}
