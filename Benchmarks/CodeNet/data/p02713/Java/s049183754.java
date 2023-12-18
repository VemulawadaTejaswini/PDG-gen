import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int ans = 0;
        for(int a= 0;a<K;a++){
            for(int b= 0 ;b<K;b++){
                for(int c= 0;c<K;c++){
                    ans = ans + mgcd(a+1,b+1,c+1);
                }
            }
        }
        System.out.println(ans);
    }

    public static final int mgcd(int a, int b, int c) {
        int g = gcd(a,b);
        g = gcd(g,c);
    return g;
    }

    public static final int gcd(int a, int b) {

        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        int r = -1;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }

        return a;
    }


}