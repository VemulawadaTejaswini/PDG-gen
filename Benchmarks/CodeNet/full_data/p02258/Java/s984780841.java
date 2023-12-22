import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int r[] = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        long max = -1000000010;
        long min = r[0];
        for (int i = 1; i < n; i++) {
            if (r[i] - min > max)
                max = r[i] - min;
            if (r[i] < min)
                min = r[i];
        }
        System.out.println(max);
        sc.close();
    }
}
