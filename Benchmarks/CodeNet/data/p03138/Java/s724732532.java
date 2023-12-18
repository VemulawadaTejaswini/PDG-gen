import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();

        long[] a = new long[N];
        for(int i = 0; i<N; i++) a[i] = sc.nextLong();

        long[][] keta = new long[46][2];

        for(int i = 0; i<46; i++) keta[i][0] = keta[i][1] = -1;
        keta[45][0] = 0;

        for(int k = 44; k>=0; k--) {
            long cnt = 0;
            for (int i = 0; i < N; i++) {
                cnt += (a[i] >> k)%2;
            }

            long mask = (K>>k)%2;
            if(keta[k+1][1] >= 0) keta[k][1] = Math.max(keta[k][1], keta[k+1][1] + (Math.max(N-cnt, cnt)<<k));
            if(keta[k+1][0] >= 0) {
                if(mask == 1) {
                    keta[k][1] =  Math.max(keta[k][1], keta[k+1][0] + (cnt<<k));
                    keta[k][0] =  Math.max(keta[k][0], keta[k+1][0] + ((N-cnt)<<k));
                }else{
                    keta[k][0] =  Math.max(keta[k][0], keta[k+1][0] + (cnt<<k));
                    //System.out.println(k + " " + cnt + " " + keta[k][0]);
                }
            }
        }
        System.out.println(Math.max(keta[0][0], keta[0][1]));
    }
}