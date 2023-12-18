import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t[] = new long[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextLong();
        }
        Arrays.sort(t);
        long lcm;
        for (int i = 1; ; i++) {
            lcm = t[n - 1] * i;
            boolean bre = false;
            for (int j = 0; j < n - 1; j++) {
                if (lcm % t[j] != 0) {
                    bre = true;
                    break;
                }
            }
            if (!bre) {
                break;
            }
        }
        System.out.println(lcm);

    }
}
