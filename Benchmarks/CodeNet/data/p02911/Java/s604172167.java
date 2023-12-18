import java.util.*;
 
public class Main {
    public static void main(String args[]) {
       ///値を取得
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int K = sc.nextInt();    
       int Q = sc.nextInt();    
       
       int[] A = new int[Q];
       int[] count = new int[N+1];    
       
       for(int i = 0; i < Q; ++i) {
           A[i] = sc.nextInt(); 
           count A[i]++;
       }
       
       for(int j = 0; j < N; ++j) {
            if(K - Q + count[j] > 0) {
                System.out.println("Yes");
            } else {
               System.out.println("No");
            }
       }
    }
}