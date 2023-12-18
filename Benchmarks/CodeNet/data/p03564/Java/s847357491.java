import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        sc.close();

        int ans = 0;

        if (K == 1) {

            System.out.println(1+N);
        } else if (K > 1 && K <= 3) {

            if ( N > 2) {

                ans = 4 + K*(N-2);
            } else {

                ans = 1* (2^N);
            }

            System.out.println(ans);
        } else if (K > 3 && K <= 7) {

            if ( N > 3) {

                ans = 8 + K*(N-3);
            } else {

                ans = 1* (2 ^ N);
            }
            System.out.println(ans);
        } else {

            if ( N > 4) {

                ans = 16 + K*(N-4);
            } else {

                ans = 1* (2^N);
            }
            System.out.println(ans);
        }
    }

}
