import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        double ave[] = new double[n];
        for (int i = 0; i < n; i++) {
            ave[i] = Math.abs(a - (t - 0.006 * sc.nextInt()));
        }
        double min = ave[0];
        int mini = 0;
        for (int i = 1; i < n; i++) {
            if (min > ave[i]) {
                mini = i;
            }
        }
        System.out.println(mini + 1);
    }
}

