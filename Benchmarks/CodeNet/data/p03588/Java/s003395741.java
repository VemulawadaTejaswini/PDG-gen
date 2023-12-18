import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            max = Math.max(a[i], max);
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                System.out.println(a[i] + b[i]);
                return ;
            } 
        }
    }
}