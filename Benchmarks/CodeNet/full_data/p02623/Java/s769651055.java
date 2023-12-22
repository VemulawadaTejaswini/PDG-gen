import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong(); //机Aに積まれている本
        long M = sc.nextLong(); //机Bに積まれている本
        long K = sc.nextLong(); //合計所要時間

        long[] A = new long[(int) N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        long[] B = new long[(int) M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextLong();
        }

        long time = 0;
        long count = 0;

        int aCnt = 0;
        int bCnt = 0;
        for (int i = 0; i < (A.length + B.length); i++) {
            if (aCnt < A.length && bCnt < B.length) {
                if (A[aCnt] < B[bCnt]) {
                    if ((K < time)) break;
                    if((K - time) < A[aCnt]) break;
                    time += A[aCnt];
                    aCnt++;
                    count++;
//                    System.out.println("if1");
                } else {
                    if ((K < time)) break;
                    if((K - time) < B[bCnt]) break;
                    time += B[bCnt];
                    bCnt++;
                    count++;
//                    System.out.println("if2");
                }
            } else if (aCnt < A.length) {
                if ((K < time)) break;
                if((K - time) < A[aCnt]) break;
                time += A[aCnt];
                aCnt++;
                count++;
//                System.out.println("if3");
            } else if (bCnt < B.length){
                if ((K < time)) break;
                if((K - time) < B[bCnt]) break;
                time += B[bCnt];
                bCnt++;
                count++;
//                System.out.println("if4");
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}