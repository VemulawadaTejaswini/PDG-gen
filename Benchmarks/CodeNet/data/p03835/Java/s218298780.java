import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();

        int cnt = 0;
        for (int x = 0; x <= k; x++) {
            for (int y = 0; y <= (k - x); y++) {
                for (int z = 0; z <= (k - x - y); z++) {
                    int sum = x + y + z;
                    if (sum < 2) {
                        continue;
                    } else if (2500 < sum) {
                        break;
                    } else if (sum == s) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}