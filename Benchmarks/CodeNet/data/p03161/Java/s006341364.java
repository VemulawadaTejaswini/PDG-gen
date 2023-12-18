import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private int N = (int) (1e5 + 1);
    //private int[] stones = new int[N];
    private static List<Integer> stones = new ArrayList<>();
    private static int n;
    private static int k;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        n = input.nextInt();
        k = input.nextInt();
        for (int i = 0; i < n; i++) {
            stones.add(input.nextInt());
        }
        int[] alreadyComputed = new int[n];
        for (int i = 0; i < n; i++) {
            alreadyComputed[i] = -1;
        }
        System.out.println(solution(stones, n - 1, k, alreadyComputed));
    }

    public static int solution(List<Integer> stones, int n, int k, int[] alreadyComputed) {
        if (n == 0) {
            return 0;
        }
        if (alreadyComputed[n] != -1) {
            return alreadyComputed[n];
        }
        int minimum = (int)(1e9);
        if (n < k) {
            k = n;
        }
        for (int i = 1; i <= k; i++) {

            int poss1 = solution(stones, n - i, k, alreadyComputed) + Math.abs(stones.get(n) - stones.get(n - i));
            if (poss1 < minimum) {
                minimum = poss1;
            }
        }
        alreadyComputed[n] = minimum;
        return alreadyComputed[n];
    }
}

