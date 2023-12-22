import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Long> seven = new ArrayList<>();
        for (long i = 6; i <= 300000; i += 7) {
            seven.add(i);
            if (i + 2 > 300000) {
                break;
            }
            seven.add(i + 2);
        }
        List<Long> prime = new ArrayList<>();
        for (long num : seven) {
            if (isPrime(num)) {
                prime.add(num);
            }
        }
        while (true) {
            long n = sc.nextLong();
            if (n == 1) {
                return;
            }
            
            List<Long> ans = new ArrayList<>();
            for (long num : prime) {
                if (n % num == 0) {
                    ans.add(num);
                }
            }
            System.out.print(n + ":");
            for (long a : ans) {
                System.out.printf(" %d", a);
            }
            System.out.println();
        }
    }

    public static boolean isSeven(long x) {
        if (x % 7 == 1 || x % 7 == 6) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(long x) {
        if (x == 1) {
            return false;
        }
        for (long i = 2; i * i <= x; i++) {
            if (x % i == 0 && isSeven(i)) {
                return false;
            }
        }
        return true;
    }
}
