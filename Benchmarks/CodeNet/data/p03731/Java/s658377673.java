import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextInt();

        long a = sc.nextLong(); // always 0
        long b = 0;
        long c = 0;
        for (int i = 1; i < n; i++) {
            b = sc.nextLong();
            c += Math.min(t, b-a);
            a = b;
        }

        System.out.println(c+t);
    }

}