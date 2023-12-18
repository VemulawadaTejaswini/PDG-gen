import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
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
