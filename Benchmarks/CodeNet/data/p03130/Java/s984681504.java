import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[5];

        x[sc.nextInt()]++;
        x[sc.nextInt()]++;
        x[sc.nextInt()]++;
        x[sc.nextInt()]++;
        x[sc.nextInt()]++;
        x[sc.nextInt()]++;

        int[] r = new int[2];

        for (int i = 1; i < 5; ++i) {
            if (x[i] == 1) {
                r[0]++;
            } else if (x[i] == 2) {
                r[1]++;
            }
        }

        System.out.println(r[0] == r[1] ? "YES" : "NO");
    }
}