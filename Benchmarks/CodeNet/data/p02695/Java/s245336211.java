import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];

        for(int i = 0 ; i < Q ; i++){
            a[i] = sc.nextInt() -1;
            b[i] = sc.nextInt() -1;
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }

        int A[] = new int[N];
        for(int i = 0 ; i < N ; i++){
            A[i] = 1;
        }

        long ans = 0;
        while(true) {
            int pos = N;
            for(int i = N-1 ; i >= 1 ; i--){
                if(A[i] > M){
                    A[i-1]++;
                    pos = i;
                }else{
                    break;
                }
            }
            while(pos < N){
                A[pos] = A[pos-1];
                pos++;
            }
            if(A[0] > M){
                break;
            }

            long score = 0;
            for (int q = 0; q < Q; q++) {
                if (A[b[q]] - A[a[q]] == c[q]) {
                    score += d[q];
                }
            }
            ans = Math.max(ans, score);
            A[N-1]++;
        }

        System.out.println(ans);
    }
}
