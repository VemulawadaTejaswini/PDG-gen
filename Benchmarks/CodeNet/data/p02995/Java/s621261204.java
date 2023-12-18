import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long sc = scanner.nextLong() - 1;
        long sc2 = scanner.nextLong();
        long sc3 = scanner.nextLong();
        long sc4 = scanner.nextLong();
        long bet = sc2 - sc + 1;
        
        long tmp = sc2/sc3;
        long tmp2 = sc/sc3;
        long minus1 = tmp - tmp2;

        long tmp3 = sc2/sc4;
        long tmp4 = sc/sc4;
        long minus2 = tmp3 - tmp4;
        
        long tmp5 = sc2/lcm(sc3,sc4);
        long tmp6 = sc/lcm(sc3,sc4);
        long minus3 = tmp5 - tmp6;
        long ans = bet - minus1 - minus2 + minus3;
        System.out.println(ans - 1);
    }
    private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
    }
    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
}