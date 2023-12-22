import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] x = new long[n];
        long[] y = new long[n];
        for (int i=0; i<n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
        }
        long max = 0;
        long min = Long.MAX_VALUE;
        
        for (int i=0; i<n; i++) {
            if (x[i] + y[i] > max) max = x[i] + y[i];
            if (x[i] + y[i] < min) min = x[i] + y[i];
        }
        System.out.print(max - min);
    }
}
