import java.util.*;

public class Main {
    public static void main(String args[]) {
       //値の取得
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[] P = new int[N];
       
       int count = 0; //条件を満たす整数のカウント
       
       for (int i = 0; i < N; ++i) {
            P[i] = sc.nextInt();
            int Pj = P[0];
            
             if(P[i] <= Pj) {
               ++count;
           }
            Pj = P[i];
       }
       
       System.out.println(count);
       
    }
}
