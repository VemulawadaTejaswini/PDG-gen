import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        sc.close();

        long money = 100;
        long i = 1;
        for (;; i++) {
            money = money + (long) (money * 0.01);
            if (money >= A) {
                break;
            }
        }

        System.out.println(i);

    }
}
