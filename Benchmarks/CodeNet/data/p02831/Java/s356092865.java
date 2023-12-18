import java.util.*;


public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a*b/ gcd(a, b));
    }

    private static int gcd(int m, int n) {
        if(m<n) return gcd(n,m);
        if(n == 0) return m;
        return gcd(n,m%n);
    }
}