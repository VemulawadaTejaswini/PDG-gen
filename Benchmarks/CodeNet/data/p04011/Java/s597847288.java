import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int cost = 0;
        if (n > k) {
            cost = y * (n-k) + k * x;
        } else {
            cost = n * x;
        }

        System.out.println(cost);
    }
}
