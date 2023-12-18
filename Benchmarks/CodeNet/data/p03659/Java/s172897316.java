import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        long sum = Arrays.stream(a).sum();
        long min = Long.MAX_VALUE;
        long x = 0;
        for (int i = 0; i < n - 1; i++) {
            x += a[i];
            if (min > Math.abs(sum - x - x))
                min = Math.abs(sum - x - x);
        }
        System.out.println(min);
    }
}