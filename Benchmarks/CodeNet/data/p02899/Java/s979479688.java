import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int [] ans = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            ans[a[i] - 1] = i + 1;
        }
        for (int i : ans) {
            System.out.println(i);
        }
    }
}