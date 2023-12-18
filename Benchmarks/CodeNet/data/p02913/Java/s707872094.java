import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        StringBuilder sb = new StringBuilder(S);
        int ans = 0;
        for (int i=0;i<S.length();i++) {
            String S_tmp = sb.substring(i);
            int[] z = z_algo(S_tmp);
            for (int j=0;j<S.length()-i;j++) {
                if (i>=z[j]) {
                    ans = Math.max(ans,z[j]);
                }
            }
        }
        System.out.println(ans);
    }

    public static int[] z_algo(String S) {
        int N = S.length();
        int[] A = new int[N];
        A[0] = N;
        int i = 1;
        int j = 0;
        while (i < N) {
            while (i+j < N && S.charAt(j) == S.charAt(i+j)) {
                j++;
            }
            A[i] = j;
            if (j==0) {
                i++;
                continue;
            }
            int k=1;
            while (i+k < N && k+A[k] < j) {
                A[i+k] = A[k];
                k++;
            }
            i += k;
            j -= k;
        }
        return A;
    }
}