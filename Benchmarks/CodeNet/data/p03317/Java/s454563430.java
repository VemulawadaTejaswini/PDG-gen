import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int minLocation = -1;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (tmp == 1) {
                minLocation = i;
            }
        }
        int ans = 0;

        // left side of minLocation
        ans += minLocation / (k - 1);
        if (minLocation % (k - 1) != 0) {
            ans++;
        }
        // right side of minLocation
        ans += (n - minLocation - 1) / (k - 1);
        if ((n - minLocation - 1) % (k - 1) != 0) {
            ans++;
        }

        System.out.println(ans);

        sc.close();
    }

}
