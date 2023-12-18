import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        long[] p = new long[A];
        long[] q = new long[B];
        long[] r = new long[C];
        for (int i = 0; i < A; i++) {
            p[i] = sc.nextLong();
        }
        for (int i = 0; i < B; i++) {
            q[i] = sc.nextLong();
        }
        for (int i = 0; i < C; i++) {
            r[i] = sc.nextLong();
        }
        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);
        long sum = 0L;
        for (int i = 0; i < x; i++) {
            sum += p[A-1-i];
        }
        for (int i = 0; i < y; i++) {
            sum += q[B-1-i];
        }
        int idxp = A-x, idxq = B-y;
        for (int i = 0; i < C; i++) {
            long dp = A-1 < idxp ? -1 : r[C-1-i] - p[idxp];
            long dq = B-1 < idxq ? -1 : r[C-1-i] - q[idxq];
            if(dp <= 0 && dq <= 0)break;
            if(dp < dq){
                sum += dq;
                idxq++;
            }else{
                sum += dp;
                idxp++;
            }
        }
        System.out.println(sum);
        sc.close();

    }

}
