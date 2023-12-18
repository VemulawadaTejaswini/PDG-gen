import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();

        int[] list = new int[N];
        double[] wa = new double[N+1];
        double max = 0;

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
            wa[i+1] = wa[i] + pre(list[i]);
        }

        for (int i = 0; i < N+1-K; i++) {
            max = Math.max(max, wa[i+K] - wa[i]);
        }
        System.out.println(max);
    }

    static double pre (int x) {
        return ((double)x + 1) / 2;
    }
}