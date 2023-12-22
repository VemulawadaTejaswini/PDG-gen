import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] A = new Integer[N];
        int ans = 0;
       boolean canDiv = false;
        for(int i = 0; i < N; i++) A[i] = sc.nextInt();
        Arrays.sort(A, Collections.reverseOrder());
          out:for(int i = 0; i < N ; i++) {
            in:for(int j = i + 1; j < N; j++) {
              if(A[i] % A[j] == 0) {
                canDiv = false;
                continue out;
              }
              canDiv = true;
            }
           if(canDiv)ans++;
         }
      System.out.println(ans);
    } 
}