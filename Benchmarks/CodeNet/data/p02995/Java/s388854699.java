import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int cnt = 0;
        for (long i = a; i <= b; i++) {
            if (i % c != 0 && i % d != 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}