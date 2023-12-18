import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private int N = (int) (1e5 + 1);
    //private int[] stones = new int[N];
    private static List<Integer> stones = new ArrayList<>();
    private static int n;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            stones.add(input.nextInt());
        }
        int[] alreadyComputed = new int[n];
        for (int i = 0; i < n; i++) {
            alreadyComputed[i] = -1;
        }
        System.out.println(solution(stones, n - 1, alreadyComputed));
    }

    public static int solution(List<Integer> stones, int n, int[] alreadyComputed) {
        if (n == 0) {
            return 0;
        }
        if (alreadyComputed[n] != -1) {
            return alreadyComputed[n];
        }
        int poss1 = solution(stones, n - 1, alreadyComputed) + Math.abs(stones.get(n) - stones.get(n - 1));
        int poss2;
        if (n-2 < 0) {
            poss2 = (int)(1e9 + 7);
        } else {
            poss2 = solution(stones, n - 2, alreadyComputed) + Math.abs(stones.get(n) - stones.get(n - 2));
        }
        alreadyComputed[n] = Math.min(poss1, poss2);
        return alreadyComputed[n];
    }
}
