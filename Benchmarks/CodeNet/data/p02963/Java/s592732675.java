import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        check(num);
    }

    public static void check(String num) {

        int n = Integer.parseInt(num);

        if(n%2==0) {
            double sqrt = Math.sqrt((double)n);
            System.out.printf("0 0 %d 0 0 %d", (int)sqrt, (int)sqrt);
            return;
        }
        System.out.printf("0 0 %d 0 %d 1", n, n);
    }
}