import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int ans = 0;
        for (int m = 1; m < n; m++) {
            if (n / m == n % m)
                ans += m;
        }
        System.out.println(ans);
        sc.close();
    }
}