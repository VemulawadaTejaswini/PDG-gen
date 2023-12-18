import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        try (Scanner cin = new Scanner(System.in)) {
            n = cin.nextInt();
        }
        int minsum = Integer.MAX_VALUE;
        for (int a = 1; a <= n / 2; a++) {
            int min = digitsSum(a) + digitsSum(n-a);
            minsum = Math.min(minsum, min);
        }

        System.out.println(minsum);
    }

    static int digitsSum(int x) {
        int t = x;
        int s = 0;
        while(t > 0) {
            s += t % 10;
            t = t / 10;
        }
        return s;
    }
}
