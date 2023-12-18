import java.util.Scanner;

class A {

    static final int[] money = new int[300];

    static {
        money[1] = 300000;
        money[2] = 200000;
        money[3] = 100000;
    }

    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int X = sc.nextInt();
        final int Y = sc.nextInt();
        System.out.println(money[X] + money[Y] + (X == 1 && Y == 1 ? 400000 : 0));
    }
}
public class Main {
    public static void main(String... args) {
        A.main();
    }
}
