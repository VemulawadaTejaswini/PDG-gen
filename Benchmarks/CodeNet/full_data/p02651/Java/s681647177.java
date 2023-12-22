import java.util.Arrays;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        long T = scan.nextLong();
        for (long ii = 0; ii < T; ii++) {
            int N = scan.nextInt();
            long A[] = new long[N];

            for (int i = 0; i < N; i++) {
                A[i] = scan.nextLong();
            }
            String S = scan.next();
            int P0 = 0;
            int P1 = 0;
            for (int i = 0; i < N; i++) {
                if (S.substring(i, i + 1).equals("0")) {
                    P0++;
                } else {
                    P1++;
                }
            }
            int N0[] = new int[P0];
            int N1[] = new int[P1];
            int p = 0;
            int q = 0;

            for (int i = 0; i < N; i++) {
                if (S.substring(i, i + 1).equals("0")) {
                    N0[p] = i;
                    p++;
                } else {
                    N1[q] = i;
                    q++;
                }
            }
            int k0 = (int) Math.pow((double) 2,P0 );
            int k1 = (int) Math.pow((double) 2, P1);
            long L0[] = new long[k0+1];
            long L1[] = new long[k1+1];
            for (int i = 0; i < 1 << P0; i++) {


                for (int j = 0; j < P0; j++) {
                    // 1loop毎にどの参考書を買うかの判定(j冊目を買うかどうか)

                    if ((1 & i >> j) == 1) {
                        L0[i] = L0[i] ^ A[N0[j]];
                        // ここに引っかかった = 買う対象に追加(j冊目購入)
                    }
                }

            }
            for (int i = 0; i < 1 << P1; i++) {


                for (int j = 0; j < P1; j++) {
                    // 1loop毎にどの参考書を買うかの判定(j冊目を買うかどうか)

                    if ((1 & i >> j) == 1) {
                        L1[i] = L1[i] ^ A[N1[j]];
                        // ここに引っかかった = 買う対象に追加(j冊目購入)
                    }
                }

            }
            int P = 0;

            for (int i = 0; i < k1+1 && P == 0; i++) {int Y=0;
                for (int j = 0; j < k0+1; j++) {
                    long M = L1[i] ^ L0[j];
                    if (M == 0) {Y=1;

                    }

                }
                if (Y == 0) {P=1;}
            }
            System.out.println(P);
        }
    }


}

