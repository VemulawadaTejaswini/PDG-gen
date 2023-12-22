import static java.lang.Math.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int sum = 0;
            for (int i = 1; i <= 6; i++) {
                sum += n / pow(5, i);
            }
            System.out.println(sum);
        }
    }
}
