import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int coinCount = 0;

        for (int i = 0; i < 2; i++) {
            if (a > b) {
                coinCount += a;
                a--;
            } else {
                coinCount += b;
                b--;
            }
        }

        System.out.println(coinCount);
    }
}
