import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        sc.close();

        for (long i = 1;; i++) {
            if (Math.pow(i, 5) + Math.pow(i - 1, 5) == X) {
                System.out.println(i + " -" + (i - 1));
                return;
            }
        }
    }
}