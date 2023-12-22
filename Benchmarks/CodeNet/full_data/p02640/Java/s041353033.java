import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = sc.nextInt();
        boolean flg = false;

        for (int x = 0; x <= count; x++) {
            for (int y = 0; y <= count; y++) {
                if (x + y == count && 2 * x + 4 * y == sum) {
                    flg = true;
                    break;
                }
            }
        }
        if (flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}