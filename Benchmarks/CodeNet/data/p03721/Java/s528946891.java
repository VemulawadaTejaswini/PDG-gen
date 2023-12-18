import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();

        long[] c = new long[100001];
        for (int i = 0 ; i < n ; i++) {
            int a = sc.nextInt();
            c[a] += sc.nextLong();
        }
        long t = 0;
        for (int i = 1 ; i <= 100000 ; i++) {
            t += c[i];
            if (t >= k) {
                System.out.println(i);
                return;
            }
        }
    }

}