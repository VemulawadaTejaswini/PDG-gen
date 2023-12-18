import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        sc.close();

        int min = l % 2019;
        int max = Math.min((r - l), 2019);
        int ans = 2019;
        for (int i = min; i <= min + max; i++) {
            for (int j = min + 1; j <= min + max; j++) {
                int tmp = (i * j) % 2019;
                if (tmp < ans) {
                    ans = tmp;
                }
            }
        }
        System.out.println(ans);
    }

}
