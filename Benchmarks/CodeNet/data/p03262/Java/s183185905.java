
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n ; i++) {
            x[i] = Math.abs(sc.nextInt() - X);
        }
//  全部の最大公約数がＤになるー
        if ( n > 1) {
            int g = gcd(x[0], x[1]);
            for (int i = 1; i < n - 1 ; i++) {
                 g = gcd(g, x[i + 1]);
            }
            System.out.println(g);
        } else {
            System.out.println(x[0]);
        }


    }
    static int gcd (int x, int y) {
        if(x < y) return gcd(y, x);
        if(y == 0) return x;
        return gcd(y, x % y);
    }

}


