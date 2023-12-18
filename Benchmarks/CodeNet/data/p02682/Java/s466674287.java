import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();

        if (A >= K) {
            System.out.println(K);
            System.exit(0);
        } else {
            K -= A;
        }

        if (B >= K) {
            System.out.println(A);
        } else {
            K -= B;
            System.out.println(A-K);
        }

    }
}