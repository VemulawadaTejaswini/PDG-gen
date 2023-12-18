import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int sort[] = Arrays.copyOf(x, n);
        Arrays.sort(sort);
        int mid1 = sort[n / 2 - 1];
        int mid2 = sort[n / 2];
        for (int i = 0; i < n; i++) {
            if (x[i] <= mid1) {
                System.out.println(mid2);
            } else {
                System.out.println(mid1);
            }
        }
    }
}