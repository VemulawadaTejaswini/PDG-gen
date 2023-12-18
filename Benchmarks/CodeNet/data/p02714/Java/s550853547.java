import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long N = sc.nextLong();
        String S = sc.next();
        long R = 0;
        long G = 0;
        long B = 0;
        for(int i = 0; i < N; i++){
          if(S.charAt(i) == 'R'){
            R++;
          }else if(S.charAt(i) == 'G'){
            G++;
          }else if(S.charAt(i) == 'B'){
            B++;
          }
        }
        long ans = R*G*B;
        for (int i = 0; i < N-2; i++) {
          for (int j = i + 1; j < N-1; j++) {
            int k = 2*j-i;
            if (k >= N) {
                continue;
            }
            if(S.charAt(i) != S.charAt(j) && S.charAt(i) != S.charAt(k) && S.charAt(j) != S.charAt(k)){
                ans--;
            }
          }
        }
        System.out.println(ans);
      }
}
