import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int sum = 0;

        for (int a = 1; a <= k; a++) {
            for (int b = 1; b <= k; b++) {
                for (int c = 1; c <= k; c++) {
                    sum += gcd(a, gcd(b, c));
                }
            }
        }
        System.out.println(sum);
    }

    private static int gcd(int m, int n){
        if(m % n == 0){
            return n;
        }
        return gcd(n, m % n);
    }
}