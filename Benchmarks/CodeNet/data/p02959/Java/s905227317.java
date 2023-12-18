import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] monsters = new int[n+1];
        int[] power = new int[n];
        for (int i = 0; i <= n; i++) monsters[i] = sc.nextInt();
        for (int i = 0; i < n; i++) power[i] = sc.nextInt();

        int result = 0;
        int lest = 0;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                result += Math.min(monsters[i], power[i]);
                if (monsters[i] < power[i]) lest = power[i] - monsters[i];
            } else if (i == n) result += Math.min(monsters[i], lest);
            else {
                result += Math.min(monsters[i], power[i] + lest);
                if (monsters[i] < power[i] + lest) lest = power[i] + lest - monsters[i];
                else lest = 0;
            }
        }
        System.out.println(result);
    }
}