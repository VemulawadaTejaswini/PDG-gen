import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[3];
        for (int i = 0; i < 3; i++) {
            n[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(n);

        int a = n[2] - n[0];
        int b = n[2] - n[1];

        int cnt = 0;
        if ((a - b) % 2 > 0) {
            b++;
            cnt++;
        }
        cnt += b;
        a -= b;
        cnt += a / 2;

        System.out.println(cnt);
    }
}
