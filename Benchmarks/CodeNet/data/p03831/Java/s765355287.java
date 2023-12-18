import java.util.*;

public class Main {
    public static void main(String[] args) {
//        test();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] cities = new int[N];
        for (int i = 0; i < N; i++) {
            cities[i] = sc.nextInt();
        }

        System.out.println(calc(N, A, B, cities));
    }

    private static int calc(int n, int a, int b, int[] cities) {
        int cost = 0;

        for (int i = 0; i < n-1; i++) {
            if ((cities[i+1] - cities[i]) * a < b)
                cost += (cities[i+1] - cities[i]) * a;
            else
                cost += b;
        }

        return cost;
    }

    private static void test() {
        assert calc(4, 2, 5, new int[] {1,2,5,7}) == 11;
        assert calc(7,1, 100, new int[] {40,43,45,105,108,115,124}) == 84;
        assert calc(7,1,2, new int[] {24,35,40,68,72,99,103}) == 12;
    }
}
