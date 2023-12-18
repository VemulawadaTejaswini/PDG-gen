import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean isOdd = false;
        for (int i = 1; i < 4; i++) {
            if ((a * b * i) % 2 != 0) {
                isOdd = true;
                break;
            }
        }

        if (isOdd) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
