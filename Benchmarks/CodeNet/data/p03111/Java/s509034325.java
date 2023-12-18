import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] kadomatsu = new int[n];
        for(int i = 0; i < n; i++) {
            kadomatsu[i] = sc.nextInt();
        }
        System.out.println(dfs(kadomatsu, n, 0, a, 0, b, 0, c, 0));
    }
    private static int dfs(int[] kadomatsu, int n, int currentN, int a, int currentA, int b, int currentB, int c, int currentC) {
        if(currentN == n) {
           if(currentA != 0 && currentB != 0 && currentC != 0) {
               return  Math.abs(a - currentA) + Math.abs(b - currentB) + Math.abs(c - currentC) - 30;
           }
           return 10000;
        }
        int candidate1 = dfs(kadomatsu, n, currentN + 1, a, currentA, b, currentB, c, currentC);
        int candidate2 = dfs(kadomatsu, n, currentN + 1, a, currentA + kadomatsu[currentN], b, currentB, c, currentC) + 10;
        int candidate3 = dfs(kadomatsu, n, currentN + 1, a, currentA, b, currentB + kadomatsu[currentN], c, currentC) + 10;
        int candidate4 = dfs(kadomatsu, n, currentN + 1, a, currentA, b, currentB, c, currentC + kadomatsu[currentN]) + 10;

        return Math.min(candidate1, Math.min(candidate2, Math.min(candidate3, candidate4)));
    }
}
