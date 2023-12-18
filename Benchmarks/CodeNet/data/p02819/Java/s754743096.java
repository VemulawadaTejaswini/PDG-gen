import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int d = 2;
        while (true) {
            if (d > X/2) {
                break;
            }

            if (X%d == 0) {
                X++;
                d = 2;
            } else {
                d++;
            }
        }

        System.out.println(X);
    }
}
