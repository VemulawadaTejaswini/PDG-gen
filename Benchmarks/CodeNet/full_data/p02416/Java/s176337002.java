import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = 0;
            int x = sc.nextInt();
            if (x == 0) {
                break;
            } else {
                int y;
                for (int i = 0; i < 1000; i++) {
                    y = x % 10;
                    x = x - y;
                    x = x / 10;
                    a = a + y;
                }
                System.out.println(a);
            }
        }
    }
}
