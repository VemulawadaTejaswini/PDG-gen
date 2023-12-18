import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int count = 1;
        int money = 100;
        while (true) {
            money *= 1.01;
            if (money >= X) {
                System.out.println(count);
                return;
            }
            count++;
        }
    }
}