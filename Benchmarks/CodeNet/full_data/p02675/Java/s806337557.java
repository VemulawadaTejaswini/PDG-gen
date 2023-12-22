import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();

        long judge = N % 10;

        if (judge == 2 || judge == 4 || judge == 5 || judge == 7 || judge == 9) {
            System.out.println("hon");
        } else if (judge == 0 || judge == 1 || judge == 6 || judge == 8) {
            System.out.println("pon");
        } else {
            System.out.println("bon");
        }

    }
}
