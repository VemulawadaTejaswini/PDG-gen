import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();

        double max = 0;
        int[] list = new int[N];
        Map<Integer, Double> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
            if (map.get(list[i]) == null) {
                map.put(list[i], pre(list[i]));
            }
            if (i >= K-1) {
                double tmp = 0;
                for (int j = i; j > i - K; j--) {
                    tmp += map.get(list[j]);
                }
                if (tmp > max) {
                    max = tmp;
                }
            }
        }

        System.out.println(max);
    }

    static double pre (int x) {
        return ((double)x + 1) / 2;
    }
}