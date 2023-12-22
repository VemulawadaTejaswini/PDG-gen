import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        int[] B = new int[M];

        st  = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st  = new StringTokenizer(br.readLine());

        for (int i=0; i<M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        int sumA = 0, sumB = 0;
        int ptrA = 0, ptrB = 0;

        for (int i=0; i<N; i++) {
            if (sumA+A[i]<=K) {
                ptrA++;
                sumA+=A[i];
            }
            else
                break;
        }
        for (int i=0; i<M; i++) {
            if (sumB+B[i]<=K) {
                ptrB++;
                sumB+=B[i];
            }
            else
                break;
        }
        int ans=Math.max(ptrB,ptrA);

        if (ptrA>ptrB) {
            ptrB = 0;
            for (int i=0; i<M; i++) {
                if (sumA+B[i]<=K) {
                    ptrB++;
                    sumA+=B[i];
                }
                else
                    break;
            }
            ans=ptrA+ptrB;
        }
        else if (ptrA<ptrB) {
            ptrA = 0;
            for (int i=0; i<N; i++) {
                if (sumB+A[i]<=K) {
                    ptrA++;
                    sumB+=A[i];
                }
                else
                    break;
            }
            ans=ptrA+ptrB;
        }
        else {
            if (sumA<sumB) {
                ptrB = 0;
                for (int i=0; i<M; i++) {
                    if (sumA+B[i]<=K) {
                        ptrB++;
                        sumA+=B[i];
                    }
                    else
                        break;
                }
                ans=ptrA+ptrB;
            }
            else if(sumA>sumB) {
                ptrA = 0;
                for (int i=0; i<N; i++) {
                    if (sumB+A[i]<=K) {
                        ptrA++;
                        sumB+=A[i];
                    }
                    else
                        break;
                }
                ans=ptrA+ptrB;
            }
            
        }
        System.out.println(ans);

    }

}