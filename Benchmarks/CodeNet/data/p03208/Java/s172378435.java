import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int h[] = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        int sa[] = new int[n - k + 1];
        for (int i = 0; i < n - k + 1; i++) {
            sa[i] = h[i + k - 1] - h[i];
        }
        Arrays.sort(sa);
        System.out.println(sa[0]);
    }
}