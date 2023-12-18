import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] h = new int[N];

        for(int i=0; i<N; ++i) {
            h[i] = sc.nextInt();
        }

        int r = jump(N, K, h);
        System.out.println(r);
    }

    public static int jump(int N, int K, int[] h) {
        int[] v = new int[N];

        K = Math.min(N-1, K);

        for(int j=1; j<N; ++j) {
            int t = Integer.MAX_VALUE;
            boolean bContinue = true;
            for(int d=1; d<=K && bContinue; ++d) {
                int i = j-d;
                if(i>=0){
                    t = Math.min(Math.abs(h[i]-h[j]) + v[i], t);
                }
                else {
                    bContinue = false;
                }
            }

            v[j] = t;
        }

        return v[N-1];
    }
}
