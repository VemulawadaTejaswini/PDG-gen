import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(n == 1 && k == 0) {
            System.out.println(0);
            return;
        }
        if(n == 2 && k == 0) {
            System.out.println(1);
            System.out.println(1 + " " + 2);
            return;
        }
        if(n >= 4) {
            if(n == k) {
                int src = 1;
                int dest = 2;
                System.out.println(n);
                for(int i = 0; i < n-1; i++) {
                    System.out.println(src + " " + dest);
                    src++;
                    dest++;
                }
                System.out.println(n + " " + 1);
                return;
            }
            if(n == k + 1) {
                int src = 1;
                int dest = 2;
                System.out.println(n+1);
                for(int i = 0; i < n-1; i++) {
                    System.out.println(src + " " + dest);
                    src++;
                    dest++;
                }
                System.out.println(n + " " + 1);
                System.out.println(1 + " " + 3);
                return;
            }
        }
        if(n - 2 < k) {
            System.out.println(-1);
            return;
        }
        int m = n - 1;
        System.out.println(m);
        int src = 1;
        int dest = 2;
        for(int i = 0; i < m - k; i++) {
            System.out.println(src + " " + dest);
            dest++;
        }
        src = dest - 1;
        for(int i = m - k; i < m; i++) {
            System.out.println(src + " " + dest);
            dest++;
        }
    }
}
