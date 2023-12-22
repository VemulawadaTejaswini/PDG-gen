import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long[] A = new long[N];
        long[] B = new long[M];

        st  = new StringTokenizer(br.readLine());
        A[0] = Integer.parseInt(st.nextToken());
        int ans=0;
        if (A[0]<=K) {
            ans = 1;
        }
        for (int i=1; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken())+A[i-1];

            if (A[i]<=K) {
                ans++;
            }
        }

        st  = new StringTokenizer(br.readLine());
        B[0] = Integer.parseInt(st.nextToken());
        if (A[0]<=K) {
            ans = Math.max(ans,1);
        }
        for (int i=1; i<M; i++) {

            B[i] = Integer.parseInt(st.nextToken())+B[i-1];
            if (B[i]<=K) {
                ans = Math.max(ans,i+1);
            }
        }
        int bestJ=M-1;
        for (int i=0; i<N; i++) {
            if (A[i]>K) {
                break;
            }
            for (int j=bestJ; j>=0; j--) {
                if (A[i]+B[j]<=K) {
                    ans=Math.max(ans, i+j+2);
                    bestJ=j;
                    break;
                }
            }

        }

        System.out.println(ans);

    }

}