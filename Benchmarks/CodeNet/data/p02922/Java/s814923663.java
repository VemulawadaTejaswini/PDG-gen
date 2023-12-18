import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int count = X;
        int value = X;
        int i;
        if (X == Y) {
            System.out.println(1);
            System.exit(0);
        }
        for (i = 2; i < 19; i++) {
            count = count + value - 1;
            if (count >= Y) {
                break;
            }
        }
        System.out.println(i);
    }
}