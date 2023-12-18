import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] h = new int[n];

        int ans = 1;
        boolean flg = true;

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            flg = true;
            for (int j = 0; j < i; j++) {
                if (h[i] < h[j]) {
                    flg = false;
                    break;
                }
            }
            if (flg) {
                ans++;
            }
        }

        sc.close();

        System.out.println(ans);
    }

}