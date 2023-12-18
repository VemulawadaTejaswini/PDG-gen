
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int max = 100;
        for (int i = 0 ; i < N ; i++) {
            int a = sc.nextInt();
            int count = 0;
            while (a % 2 == 0) {
                a /= 2;
                count++;
            }
            max = Math.min(max, count);
        }
        System.out.println(max);
    }

}