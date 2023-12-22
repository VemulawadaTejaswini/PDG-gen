import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        long max = a[1] - a[0];
        long min = a[0];
        for(int i = 1; i < n; i++){
            max = Math.max(max, a[i]-min);
            min = Math.min(min, a[i]);
        }
        System.out.println(max);
    }
}

