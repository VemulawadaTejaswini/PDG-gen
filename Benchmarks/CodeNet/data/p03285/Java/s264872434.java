import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean exist = false;
        for (int i = 0; i <= n/4; i++) {
            for (int j = 0; j <= n/7; j++) {
                if (n == (i*4) + (j*7)) {
                    exist = true;
                    break;
                }
            }
        }

        if (exist) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
