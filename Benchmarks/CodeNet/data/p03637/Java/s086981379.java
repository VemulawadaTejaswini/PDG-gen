import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int even4 = 0;
        int even2 = 0;
        int odd = 0;

        for (int i = 0 ; i < n; i++) {
            int num = sc.nextInt();

            if (num % 4 == 0) {
               even4++;
            } else if (num % 2 == 0) {
                even2++;
            } else {
                odd++;
            }
        }

        if (even2 != 0) {
            odd++;
        }

        if (n % 2 == 1) {
            n++;
        }

        String ans = (n / 2 >= odd ) ? "Yes" : "No";

        System.out.println(ans);

    }

}
