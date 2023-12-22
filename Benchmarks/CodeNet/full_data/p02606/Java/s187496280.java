import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        int ans = 0;

        for (int i = n; i < m + 1; i++) {
           if (i % d == 0) ans++;
        }

        System.out.println(ans);

        sc.close();

    }

}