import java.util.*;
import static java.lang.System.*;

import java.net.PasswordAuthentication;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        int ans = N;
        for (int i = 0; i < N; i++) {
            if (i == 0) {

            } else if (i == 1) {
                if (P[i] > P[0]) {
                    ans -= 1;
                }
            } else {
                for (int j = 0; j < i - 1; j++) {
                    if (P[i] > P[j]) {
                        ans -= 1;
                        break;
                    }
                }
            }
        }
        out.print(ans);
        
    }
}
