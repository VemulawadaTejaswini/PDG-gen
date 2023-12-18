import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = 0;
    static int m = 0;
    static int k = 0;

    public static void main(String[] args) {
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        for(int r = 0; r <= n; ++r) {
            for(int c = 0; c <= m; ++c) {
                int blackNum = c * n + r * m - 2 * c * r;
                if(blackNum == k) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        
        System.out.println("No");
    }
}