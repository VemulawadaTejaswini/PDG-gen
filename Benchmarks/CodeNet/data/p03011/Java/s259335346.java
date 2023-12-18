import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();

        //        for (int i = 0; i < n; i++) {
        //
        //        }

        sc.close();

        int ans = Math.min(p + q, Math.min(q + r, p + r));

        System.out.println(ans);

    }

}