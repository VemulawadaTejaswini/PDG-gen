import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        int N = nextInt(r);
        int M = nextInt(r);
        int[] A = new int[N];
        int[] B = new int[N*N];
        // for (int i = 0; i < N; i++) {
        //     A[i] = nextInt(r);
        //     for (int j = i; j > 0; j--) {
        //         if (A[j] > A[j-1]) {
        //             int tmp = A[j-1];
        //             A[j-1] = A[j];
        //             A[j] = tmp;
        //         } else {
        //             break;
        //         }
        //     }
        // }
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            A[i] = nextInt(r);
            for (int j = i; j >= 0; j--) {
                B[cnt] = A[i]+A[j];
                for (int k = cnt; k > 0; k--) {
                    if (B[k] > B[k-1]) {
                        int tmp = B[k-1];
                        B[k-1] = B[k];
                        B[k] = tmp;
                    } else {
                        break;
                    }
                }
                cnt++;
                if (i != j) {
                    B[cnt] = A[i]+A[j];
                    for (int k = cnt; k > 0; k--) {
                        if (B[k] > B[k-1]) {
                            int tmp = B[k-1];
                            B[k-1] = B[k];
                            B[k] = tmp;
                        } else {
                            break;
                        }
                    }
                    cnt++;
                }
            }
        }
        // for (int i = 0; i < N; i++) {
        //     A[i] = nextInt(r);
        // }
        // int max = A[0]+A[0];
        // int cnt = 0;
        // int[] ans = new int[1];

        int ans = 0;
        for (int i = 0; i < M; i++) {
            ans += B[i];
        }
        System.out.println(ans);
    }

    public static int nextInt(InputStreamReader r) throws Exception {
        String str = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            str += (char)c;
        }
        return Integer.parseInt(str);
    }
}
