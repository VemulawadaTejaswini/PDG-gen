import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int X = Integer.parseInt(sc.next());
      int A = X;
      int B = 0;
      int W = 0;
      long M[] = new long[121];
      while(W <121){
        M[W] = W*W*W*W*W;
        W++;
      }

      for(int i = 120; i > -1; i--){
        for(int j = 0; j < 121; j++){
          if(M[i] - M[j] == X){
            A = i;
            B = j;
            System.out.println(A+" "+B);
            System.exit(0);
          }else if(M[i] + M[j] == X){
            A = i;
            B = -1*j;
            System.out.println(A+" "+B);
            System.exit(0);
          }
        }
      }
}
}
