import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long max = Integer.MIN_VALUE;
        long min = sc.nextLong();

        for (int i = 1; i < n; i++) {
            long a = sc.nextLong();
            max = Math.max(max, a - min);
            min = Math.min(min, a);
        }
        System.out.println(max);
    }
}

