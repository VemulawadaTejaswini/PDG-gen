import java.math.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        double ans = N;
        for (int i = 2; i * i < N; i++) {
            if (ans % i != 0) {
               continue;
            }
            ans /= i;
            count++;
        }
        if (ans != 1 && count == 0) {
            count++;
        }
        System.out.println(count);
    }
}