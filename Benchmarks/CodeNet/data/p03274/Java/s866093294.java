import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x[] = new int[n];
        
        int min = Integer.MAX_VALUE;
        for (int i=0; i<n; i++) {
            x[i] = sc.nextInt();
            if (i >= k-1) {
                int total = x[i] - x[i-k+1] + minAbs(x[i], x[i-k+1]);
                if (total < min) {
                    min = total;
                }
            }
        }
        System.out.println(min);
    }

    private static int minAbs(int a, int b) {
        int min = Math.abs(a);
        if (Math.abs(b) < min) { min = Math.abs(b); } 
        return min;
    }
}
