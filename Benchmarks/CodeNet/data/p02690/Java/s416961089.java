import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        if(x == 1) {
            System.out.println("0 -1");
            return;
        }
        long xx = (long) Math.sqrt(Math.sqrt(x));
        for (long i = xx; i > 0; i--) {
            for (long j = -1; j < xx; j--) {
                long a = (long) Math.pow(i, 5);
                long b = (long) Math.pow(j, 5);
                if(a - b == x) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}
