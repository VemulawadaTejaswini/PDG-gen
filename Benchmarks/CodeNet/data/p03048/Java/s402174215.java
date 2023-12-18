import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 0; r * i <= n; i++) {
            int need = n - r * i;
            for (int j = 0; j * g <= need; j++) {
                if ((need - j * g) % b == 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}