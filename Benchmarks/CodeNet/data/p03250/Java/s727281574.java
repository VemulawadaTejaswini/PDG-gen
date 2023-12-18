import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[3];
        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2]  = sc.nextInt();
        sc.close();

        int ans = 0;
        int total[] = {0, 0, 0};
        total[0] = num[0] * 10 + num[1] + num[2];
        total[1] = num[1] * 10 + num[0] + num[2];
        total[2] = num[2] * 10 + num[0] + num[1];
        for (int i = 0; i < 3; i++) {
            if (total[i] > ans) ans = total[i];
        }
        System.out.println(ans);
    }
}
