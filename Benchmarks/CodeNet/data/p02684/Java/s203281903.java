import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long t = k % n;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = arr[0] - 1, pos = arr[idx];
        for (int i = 0; i < t - 1; i++) {
            pos = arr[idx];
            idx = pos - 1;
        }
        
        System.out.println(pos);
    }
}
