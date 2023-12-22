import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();

        while (n != 0 || x != 0) {
            System.out.println(combination(n, x));
            n = scn.nextInt();
            x = scn.nextInt();
        }

        scn.close();

    }

    static int combination(int n, int x) {

        int ans = 0;
        int sum;

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    sum = i + j + k;
                    if (sum == x) {
                        ans += 1;
                    }
                }
            }
        }

        return ans;

    }


}


