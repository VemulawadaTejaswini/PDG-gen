import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lax = sc.nextInt();
        int x[] = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = Math.abs(sc.nextInt() - lax);
        }
        int g;
        if (n == 1) {
            g = x[0];
        }else if (n == 2) {
            g = gcd(x[0], x[1]);
        }else{
            g = gcd(x[0], x[1]);
            for (int i = 2; i < n; i++) {
                g = gcd(g, x[i]);
            }
        }
        System.out.println(g);
    }

    public static int gcd(int x, int y){
        int nx = x;
        int ny = y;
        int tmp = nx % ny;
        while ((tmp = nx % ny) != 0) {
            nx = ny;
            ny = tmp;
        }
        return ny;
    }
}