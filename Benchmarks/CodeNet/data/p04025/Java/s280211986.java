import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            sum += a[i];
        }
        int mid = (int)Math.ceil(sum / (double)n);
        
        long cost = 0;
        for (int i = 0; i < n; i++) {
            cost += (int)Math.pow((a[i] - mid), 2);
        }
        System.out.println(cost);
    }
}
