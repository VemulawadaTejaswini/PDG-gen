import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int sum = 0;
        for(int a = 1; a <= k; a++){
            for(int b = 1; b <= k; b++){
                for(int c = 1; c <= k; c++){
                    sum += gcd(gcd(a, b),c);
                }
            }
        }
        System.out.println(sum);
    }
    public static int gcd(int m, int n) {
        int r;
        while (n > 0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
}