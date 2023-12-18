import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int n = sc.nextInt();

        long num = 1;
        if (d != 0) {
            num = 100;
            for (int i = 1; i < d; i++) {
                num *= 100;
            }
        }

      	if (n == 100)
          	n = 101;
        num *= n;

        System.out.print(num);
    }
}
