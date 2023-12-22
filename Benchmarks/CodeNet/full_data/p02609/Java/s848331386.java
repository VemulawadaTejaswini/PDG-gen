import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] x = sc.next().toCharArray();
        int pc = 0;
        for (int i = 0; i < n; i++) {
            if(x[i] == '1') pc++;
        }
        StringBuilder sb = new StringBuilder();
        if(pc == 0){
            for (int i = 0; i < n; i++) {
                sb.append(1 + "\n");
            }
        }else{
            int ppc = pc+1, mpc = pc-1;
            int[] ppcm = new int[n];
            int[] mpcm = new int[n];
            ppcm[n-1] = 1%ppc;
            mpcm[n-1] = 1%mpc;
            int pm = 0, mm = 0;
            for (int i = 0; i < n; i++) {
                if(0 < i){
                    ppcm[n-1-i] = (ppcm[n-i] * 2) % ppc;
                    mpcm[n-1-i] = (mpcm[n-i] * 2) % mpc;
                }
                if(x[n-1-i] == '1'){
                    pm = (pm + ppcm[n-1-i]) % ppc;
                    mm = (mm + mpcm[n-1-i]) % mpc;
                }
            }
            int[] dp = new int[n+1];
            dp[0] = 1;
            for (int i = 1; i <= n; i++) {
                dp[i] = dp[i % Integer.bitCount(i)] + 1;
            }
            for (int i = 0; i < n; i++) {
                if(x[i] == '1'){
                    int d = (mm + mpc - mpcm[i]) % mpc;
                    sb.append(dp[d] + "\n");
                }else{
                    int d = (pm + ppc - ppcm[i]) % ppc;
                    sb.append(dp[d] + "\n");
                }
            }
        }
        System.out.print(sb.toString());
        sc.close();

    }

}

