import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] ps;
        ps = s.split("");
        int[] p = new int[ps.length];
        for (int i = 0; i < p.length; i++) {
            p[i] = Integer.valueOf(ps[i]);
        }
        int min = Math.abs(100 * p[0] + 10 * p[1] + p[2] - 753);
        for (int i = 1; i < p.length - 2; i++) {
            if (min > Math.abs(100 * p[i] + 10 * p[i + 1] + p[i + 2] - 753))
                min = Math.abs(100 * p[i] + 10 * p[i + 1] + p[i + 2] - 753);
        }
        System.out.println(min);
    }
}