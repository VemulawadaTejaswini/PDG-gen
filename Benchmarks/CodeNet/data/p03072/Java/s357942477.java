import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) h[i] = sc.nextInt();
        int ma = h[0];
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (h[i] >= ma) {
                ans += 1;
                ma = h[i];
            }
        }
        System.out.println(ans);

    }
}
