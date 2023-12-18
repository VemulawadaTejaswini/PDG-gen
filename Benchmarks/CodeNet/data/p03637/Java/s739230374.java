import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] list = new long[n];

        int odd = 0;
        int even = 0;
        int four = 0;

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLong();
            if (list[i] % 2 == 0) {
                if (list[i] % 4 == 0) {
                    four++;
                } else {
                    even++;
                }
            } else {
                odd++;
            }
        }

        if (n % 2 == 0) {
            System.out.println(four >= odd ? "Yes" : "No");
        } else {
            System.out.println(four >= odd - 1 ? "Yes" : "No");
        }
    }
}