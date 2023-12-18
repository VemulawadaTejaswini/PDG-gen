import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int D = sc.nextInt();
        int x = sc.nextInt();

        int tmp = r * x - D;
        for (int i = 0; i < 10; i++) {
            System.out.println(tmp);
            tmp = r * tmp - D;
        }
    }
}
