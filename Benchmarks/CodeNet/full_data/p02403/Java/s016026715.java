import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i=1;; ++i) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            System.out.println(String.format("Case %d: %d", i, n));
        }

        sc.close();
    }
}
