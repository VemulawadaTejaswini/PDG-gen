import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int X = sc.nextInt();

        int rslt = K * 2 - 1;

        for (long i = 0; i < rslt; i++) {
            System.out.print(X - K + i + 1);
            if (i != rslt - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}