import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H1 = sc.nextInt();
        int M1 = sc.nextInt();
        int H2 = sc.nextInt();
        int M2 = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        int H = 0;
        int M = 0;

        if (H1 < H2) {
            M = (H2 * 60 + M2) - (H1 * 60 + M1);
        } else {
            M = ((H2 + 24) * 60 + M2) - (H1 * 60 + M1);
        }
        M -= K;
        if (M < 0) {
            M = 0;
        }

        System.out.println(M);

    }
}
