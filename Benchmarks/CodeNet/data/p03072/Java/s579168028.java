import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] H = new int[n];
        for (int i = 0; i < n; i++) H[i] = sc.nextInt();
        System.out.println(helper(H));
        sc.close();
    }

    public static int helper(int[] A) {
        int res = 0, max = A[0];
        for (int a : A) {
            if (a >= max) {
                max = a;
                res++;
            }
        }
        return res;
    }
}