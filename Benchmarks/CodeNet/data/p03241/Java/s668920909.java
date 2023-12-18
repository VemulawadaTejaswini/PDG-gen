import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        int max = M / N;
        int ans = 0;
        for (int n = 2 ; n <= max ; n++) {
            if (M % n == 0) {
                ans = n;
            }
        }
        System.out.println(M / ans);
    }
}
