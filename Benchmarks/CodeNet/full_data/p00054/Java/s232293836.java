import java.util.*;

class Main {

    static void solve (long a, long b, int n) {
        int result = 0;

        for(int i = 1; i <= n; i++) {
            a *= 10;
            result += ((long)(a / b)) % 10;
        }


        System.out.println(result);
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            solve(a, b, n);
        }

    }
}