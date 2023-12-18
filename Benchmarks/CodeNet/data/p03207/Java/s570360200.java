import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int max = p[0];
        int sum = p[0];
        for (int i = 1; i < n; i++) {
            if (max < p[i])
                max = p[i];
            sum += p[i];
        }
        System.out.println(sum - max + max / 2);
    }
}