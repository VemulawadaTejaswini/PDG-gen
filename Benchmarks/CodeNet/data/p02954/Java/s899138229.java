import java.util.*;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] s = S.split("");
        int N = s.length;
        long[] ans = new long[N];
        
        int rsum = 0;
        int lsum = 0;
        for(int i = 0; i < N; i++) {
            if(lsum == 0 && s[i].equals("R")) {
                rsum++;
                continue;
            }
            
            if(s[i].equals("L") && i < N-1) {
                lsum++;
                continue;
            }
            
            if(s[i].equals("R") || i == N-1) {
                if(i == N-1) {
                    lsum++;
                    i++;
                }
                if((rsum + lsum) % 2 == 0) {
                    ans[i - lsum - 1] = (rsum+lsum) / 2;
                    ans[i - lsum] = (rsum+lsum) / 2;
                }else {
                    ans[i - lsum - 1] = (lsum+rsum+1) / 2;
                    ans[i - lsum] = (lsum+rsum+1) / 2 - 1;
                }
                
                lsum = 0;
                rsum = 1;
            }
            
            
        }
        
        for(int i = 0; i < N; i++) {
            if(i < N - 1) {
                System.out.print(ans[i]+" ");
            }else {
                System.out.println(ans[i]);
            }
        }
    }
}