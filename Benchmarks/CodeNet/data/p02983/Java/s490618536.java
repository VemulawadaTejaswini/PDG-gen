import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        int R = Math.min(l + 2019, r);
        long ans = l * (l + 1) % 2019;
        for (; l <= R; l++) {
            for (int i = l + 1; i <= R; i++) {
                ans = Math.min(ans, l * i % 2019);
            }
        }
        System.out.println(ans);
    }
}
