import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();

        int[] list = new int[N];
        double max = 0;
        double tmp = 0;

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
            tmp += pre(list[i]);
            if (i == K-1) {max = tmp;}
            if (i >= K) {
                tmp -= pre(list[i-K]);
                max = Math.max(max, tmp);
            }
        }
        System.out.println(max);
    }

    static double pre (int x) {
        return ((double)x + 1) / 2;
    }
}