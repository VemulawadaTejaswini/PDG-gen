import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int ans = 0;
        for (int i=0; i <= n/r; i++) {
            for (int j=0; j <= n/g; j++) {
                int rem = n - i*r - j*g;
                if (rem % b == 0 && rem >= 0) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }

}
