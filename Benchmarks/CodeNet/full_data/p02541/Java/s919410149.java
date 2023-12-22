import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        long k = 1;
        while (true) {
            if ((k * (k + 1) / 2) % n == 0) {
                System.out.println(k);
                return;
            }
            k++;
        }
    }
}