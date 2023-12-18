import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] p = new Integer[n];
        Integer[] x = new Integer[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            x[i] = p[i];
        }

        Arrays.sort(x);
        int result = 0;
        for (int i = 0; i < n && result <= 2; i++) {
            if (p[i] != x[i]) {
                result++;
            }
        }

        System.out.println(result == 2 || result == 0 ? "YES" : "NO");
    }
}
