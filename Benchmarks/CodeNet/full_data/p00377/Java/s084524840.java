
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int n = 0;

        for (int i = 0; i < C; i++) {
            int m = sc.nextInt();
            n += m;
        }
        if (n % (N + 1) == 0) {
            System.out.println(n / (N + 1));
        } else {
            System.out.println(n / (N + 1) + 1);
        }
    }
}

