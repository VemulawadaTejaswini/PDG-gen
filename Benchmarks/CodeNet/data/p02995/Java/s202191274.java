import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        long D = scanner.nextLong();

        long lcm = lcm(C, D);

        long ac = (A - 1) / C;
        long ad = (A - 1) / D;
        long acd = (A - 1) / lcm;

//        long a = ac + ad - acd;

        long bc = (B / C) - ac;
        long bd = (B / D) - ad;
        long bcd = (B / lcm) - acd;

        long b = bc + bd - bcd;

        long num = B - (A - 1);
        long sum = num - b;

        System.out.println(sum);
    }

    static long lcm (long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (long)(c/b);
    }

}