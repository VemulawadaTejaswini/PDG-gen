import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long K = Long.parseLong(sc.next());
        long[] A = new long[N];
        for (int i=0;i<N;i++) {
            A[i] = Long.parseLong(sc.next());
        }

        String K_str = Long.toBinaryString(K);
        int n_1 = K_str.length();
        // int[] cnt = new int[n_1];
        int[] cnt = new int[100];
        for (int i=0;i<N;i++) {
            String A_str_a = Long.toBinaryString(A[i]);
            StringBuilder sb = new StringBuilder(A_str_a);
            sb.reverse();
            String A_str = sb.toString();
            // System.out.println(A_str);
            // System.out.println("n_1: " + n_1);
            int n_2 = A_str.length();
            // System.out.println("n_2: " + n_2);
            // for (int j=n_1-n_2;j<n_1;j++) {
            //     if (A_str.charAt(j-(n_1-n_2))=='1') {
            //         cnt[j]++;
            //     }
            // }
            for (int j=0;j<n_2;j++) {
                if (A_str.charAt(j)=='1') {
                    cnt[j]++;
                }
            }
        }

        long ans = 0;
        for (int j=0;j<100;j++) {
            if (j<n_1 && K_str.charAt(j)=='1') {
                ans += (N-cnt[j])*pow(2, j);
            } else {
                ans += cnt[j]*pow(2, j);
            }
        }
        for (int i=0;i<100;i++) {
            if (K_str.charAt(i)=='1') {
                // long tmp_ans = cnt[i]*pow(2, n_1-i-1);
                long tmp_ans = cnt[i]*pow(2, i);
                // for (int j=0;j<i;j++) {
                for (int j=i+1;j<n_1;j++) {
                    if (K_str.charAt(j)=='1') {
                        // tmp_ans += (N-cnt[j])*pow(2, n_1-j-1);
                        tmp_ans += (N-cnt[j])*pow(2, j);
                    } else {
                        // tmp_ans += cnt[j]*pow(2, n_1-j-1);
                        tmp_ans += cnt[j]*pow(2, j);
                    }
                }
                // for (int j=i+1;j<n_1;j++) {
                for (int j=0;j<i;j++) {
                    // tmp_ans += Math.max(cnt[j], N-cnt[j])*pow(2, n_1-j-1);
                    tmp_ans += Math.max(cnt[j], N-cnt[j])*pow(2, j);
                }
                // System.out.println("tmp_ans: " + tmp_ans);
                ans = Math.max(ans, tmp_ans);
            }
        }
        // System.out.println("cnt: " + Arrays.toString(cnt));
        // System.out.println(K_str);
        // System.out.println(N);
        System.out.println(ans);
    }
    static long pow(long a,int n) {
        long res=1;
        while (n>0) {
            if ((n-n/2*2)==1) {
                res=res*a;
            }
            a=a*a;
            n>>=1;
        }
        return res;
    }
}