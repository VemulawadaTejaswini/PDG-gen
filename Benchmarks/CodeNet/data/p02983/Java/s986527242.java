import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        long RSLT = 10000000;
        long rslt = RSLT;
        long temp;

        for (int i = M; i < N; i++) {
            for (int j = M + 1; j <= N; j++) {
                temp = lcm(i, j)%2019;
                rslt = (rslt > temp) ? temp : rslt;
            }
        }

        // System.out.println(rslt);
        System.out.println((rslt == RSLT) ? lcm(M, N)%2019 : rslt);
    }

    public static long lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static long gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
    

}