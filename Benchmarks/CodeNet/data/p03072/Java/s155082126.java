import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        sc.close();

        int ans = 1;
        for (int i = 1; i < n; i++) {
            boolean isOk = true;
            for (int j = 0; j < i; j++) {
                if (h[j] > h[i]) {
                    isOk = false;
                    break;
                }
            }
            if (isOk) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}
