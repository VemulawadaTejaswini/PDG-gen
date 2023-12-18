
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = false;
        for (int i = 0; i < 100; i++) {
            int tmp = n - i * 4;
            if (tmp < 0)
                break;
            if (tmp % 7 == 0)
                ans = true;
        }

        System.out.println(ans ? "Yes" : "No");

    }

}
