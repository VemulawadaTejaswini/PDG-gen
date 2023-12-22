import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];
        for (int i=0; i<n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i=0; i<n; i++) {
            if (x[i] + y[i] > max) max = x[i] + y[i];
            if (x[i] + y[i] < min) min = x[i] + y[i];
        }
        System.out.print(max - min);
    }
}
