import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int n = sc.nextInt();

        long num = 0;
        if (d == 0) {
            num = 1;
        } else {
            num = 100;
            for (int i = 1; i < d; i++) {
                num *= 100;
            }
        }

        num *= n;

        System.out.print(num);
    }
}
