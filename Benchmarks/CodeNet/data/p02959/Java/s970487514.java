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
        for (int i = 0; i < n; i++) {
            if (monsters[i] >= power[i]) result += power[i];
            else {
                result += monsters[i];
                int lest = power[i] - monsters[i];

                if (lest <= monsters[i+1]) {
                    monsters[i+1] = monsters[i+1] - lest;
                    result += lest;
                } else {
                    result += monsters[i+1];
                    monsters[i+1] = 0;
                }
            }
        }
        System.out.println(result);
    }
}