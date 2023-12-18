import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int ans = 0;
        for (int i = 1; i <= n; i += 2) {
            for (int j = 1; j <= i; j += 2) {
                int count = 0;
                for (int k = 1; k <= j; k += 2) {
                    if (j % k == 0) {
                        count++;
                    }
                }
                if (count == 8) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

}
