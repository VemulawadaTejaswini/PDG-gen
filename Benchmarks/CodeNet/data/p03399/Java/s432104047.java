import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int trainCost = a;
        if (a > b) trainCost = b;

        int busCost = c;
        if (c > d) busCost = d;

        System.out.println(trainCost + busCost);
    }
}
