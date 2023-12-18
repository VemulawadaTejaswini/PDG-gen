import java.util.Scanner;

public class Main {
    static long x, ans;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        x = in.nextLong();
        int n = 0;
        for (long i = 100; i < x;) {
            long a = i / 100;
            i += a;
            n++;
        }
        System.out.println(n);
    }
}
