import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = (calcNumOfCombination(n - k + 1, i + 1) * calcNumOfCombination(k - 1, i)) ;
        }
        for (int i = 0; i < k; i++)
            System.out.println(ans[i]);
    }

    static int calcNumOfCombination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // nの階乗を計算
    static int factorial(int n) {
        int answer = 1;
        while (n > 1) {
            answer = (answer * n) % 1000000007;
            n--;
        }
        return answer;
    }
}
